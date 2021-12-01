/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.athina;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Thanos
 */
public class ConnectionManager {
    
    private static String url = "jdbc:mysql://185.162.236.181:3306/athina";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "Foo3aez7!";
    private static Connection connection;
    private static String urlstring;
    
    
    public static Connection getConnection(){
        try {
            Class.forName(driverName);
            try {
                connection = DriverManager.getConnection(url,username,password);
                System.out.println("Connection Successful");
            } catch (SQLException ex) {
                System.out.println("Failed to create the database connection,");
                        ex.printStackTrace();
            }
        } catch (ClassNotFoundException ex){
            System.out.println("Driver not found");
        }
        return connection;
    }
    
}
