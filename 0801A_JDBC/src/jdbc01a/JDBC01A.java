package jdbc01a;

import java.sql.*;

public class JDBC01A {

    public static void main(String[] args) {
        try{
         Class.forName("oracle.jdbc.driver.DriverManager");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
