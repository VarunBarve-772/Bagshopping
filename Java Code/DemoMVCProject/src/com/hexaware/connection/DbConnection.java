package com.hexaware.connection;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    static Connection con=null;
    static
    {
        try 
        {
             Class.forName("com.mysql.cj.jdbc.Driver");
             System.out.println("Driver load...........");
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }  
    }
    
    public static Connection getConnection()
    {
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "root");
             System.out.println("Data base Conneted.........");
          } 
        catch (SQLException e) 
        {
            System.out.println(e);
        } 
        return con;
    }

}
