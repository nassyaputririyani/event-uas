package com.andriawan.event_tix.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author naufalfawwaz
 */
public class DBConn {
    
    protected Connection connection;
    protected Statement stmt;
    protected ResultSet resultSet;
    
    public DBConn() {
        this.getConnection();
    }
    
    private void getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            String url = "jdbc:mysql://localhost/event_tix";
            String username = "root";
            String password = "andriawan_24";
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Connection Failed! " + e.getMessage());
        }
    }
}
