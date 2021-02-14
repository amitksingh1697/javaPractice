import java.sql.*;
import java.io.*;

class JDBCOracle
{
	public static void main(String []a){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");//Loading the driver
			Connection c=DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe","first_time","first_time");//Getting the DB connection
			Statement st=c.createStatement();//Creating the statement to fire the Quires
			st.executeUpdate("insert into ASR values(1,'Abhishek Rai','Male','INDIA','Politics','Gorakhpur')");//CUD	Firing the Quires
			c.close();
			System.out.println("Success");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}