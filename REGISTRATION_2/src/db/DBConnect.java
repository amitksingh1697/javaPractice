package db;
import java.sql.*;
public class DBConnect {
    public static Connection con;
    public  static Statement st;
    public  static PreparedStatement checkUser,insertuser,getUserLike,updateUser,deleteUser;
    static {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");//Loading the driver
            con=DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe","REGISTRATION_2","REGISTRATION_2");//Getting the DB connection
            st=con.createStatement();
            checkUser=con.prepareStatement("select * from admin_login where username=? and password=? ");
            getUserLike=con.prepareStatement("select * from candidate where name like ?");
            insertuser=con.prepareStatement("insert into candidate (name,gender,dob,country,skills,address) values (?,?,?,?,?,?)");
            updateUser=con.prepareStatement("update candidate set name=?,gender=?,dob=?,country=?,skills=?,address=? where cid=?");
            deleteUser=con.prepareStatement("delete from candidate where cid=?");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}