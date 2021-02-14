import java.sql.*;
public class ResultSetMetaData
{
	public static void main(String args[]){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","uid","pass");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from empinfo");
			ResultSetMetaData rsmd=rs.getMetaData();
			
			int c=rsmd.getColumnCount();
			System.out.println(c);
			String n=rsmd.getColumnName(2);
			System.out.println(n);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}