package np;

import java.sql.*;



public class MyConnection {
    
    
    // create a function to connect with mysql database
    
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aj", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("connection is working");
        return con;
    }
    
}    