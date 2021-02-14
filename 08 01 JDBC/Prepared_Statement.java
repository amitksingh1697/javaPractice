import java.sql.*;
public class Prepared_Statement
{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","uid","pass");
			Statement st=con.createStatement();
			PreparedStatement ps1=con.prepareStatement("insert into empinfo values(?,?,?,?,?)");
			PreparedStatement ps2=con.prepareStatement("select * from empinfo where salary>=?");
			
			ps1.setString(1,"e101");
			ps1.setString(2,"kapil");
			ps1.setInt(3,15122);
			ps2.setInt(4,242);
			ps1.executeUpdate();
			System.out.println("Successfully Added.");
			//using that query again
			ps1.setString(1,"e109");
			ps1.setString(2,"Gita");
			ps1.setInt(3,98222);
			ps2.setInt(4,72);
			ps1.executeUpdate();
			System.out.println("Successfully Added.");

			ps2.setInt(1,151);
			ResultSet rs=ps2.executeUpdate();
			while(rs.next()){
				String s=rs.getString(2);
				int n=rs.getInt(3);
				System.out.println("Name: "+s+"\n"+"Salary: "+n);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}