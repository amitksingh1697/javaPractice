import java.sql.*;

class Transaction
{
	public static void main(String []a){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");//Loading the driver
			Connection con=DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe","first_time","first_time");//Getting the DB connection
			Statement st=con.createStatement();//Creating the statement to fire the Quires

			con.setAutoCommit(false);

			st.executeUpdate("insert into ASR values(1,'Abhishek Rai','Male','INDIA','Politics','Gorakhpur')");//CUD	Firing the Quires

			//c.commit();
			
			ResultSet rs1=st.executeQuery("Select * from empinfo where salary=45");
			if(rs1.next()){
				System.out.println("Name: "+rs1.getString(2)+"\n"+"Salary: "+rs1.getString(3));
			}
			
			/*con.rollback();
				ResultSet rs2=st.executeQuery("Select * from empinfo where salary=45");
				if(rs2.next()){
					System.out.println("Name: "+rs2.getString(2)+"\n"+"Salary: "+rs2.getString(3));
				}
			*/
		}catch(Exception e){
			System.out.println(e);
		}
	}
}