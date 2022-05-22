package com.example.oop.studentdb;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *  @author Timi Ajeigbe
 */

public class studentDb {

    /**
     * Remember 'static' means it belongs to Class - not the object
     */
    static Connection con; 
    static String driver = "com.mysql.jdbc.Driver"; // Need Drivers if haven't added to library
    static String url = "jdbc:mysql://localhost/oopstudentinformationdb"; // database connection - xampp with databse name
    static String uname = "root"; // username for mySQL Server phpMyAdmin
    static String pass = ""; // password for mySQL Server phpMyAdmin

    public static Connection getConnection() throws Exception{
        if (con == null){
            Class.forName(driver); // get Class of 'Driver'
            con = DriverManager.getConnection(url, uname, pass); // passing the connection after overwriting 'con' variable
        }
        return con; // return connection
    }
    
}
