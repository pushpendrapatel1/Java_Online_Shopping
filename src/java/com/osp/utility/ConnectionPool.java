package com.osp.utility;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionPool {

    static Connection con;

    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping", "root", "1793");
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public static void main(String[] args) {
        Connection con = ConnectionPool.connectDB();
    }
}
