import java.sql.*;

class JDBCmySQL
{
	public static void main(String []a){
		try{
			Class.forName("com.mysql.jdbc.Driver");//Loading the driver
			Connection c=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/asr","root","abhishek");//Getting the DB connection
			Statement st=c.createStatement();//Creating the statement to fire the Quires
	//		st.executeQuery("");//R Firing the Quires
			st.executeUpdate("insert into first_time values(1509010027,'Amit Kumar Singh','20')");//CUD	Firing the Quires
			c.close();
			System.out.println("Success");
			}catch(Exception e){
			System.out.println(e);
		}
	}
}