/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;

/**
 *
 * @author HP
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/");
        }
        catch(Exception e)
        {
           return null; 
        }
    }
}
