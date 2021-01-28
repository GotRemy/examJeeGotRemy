package com.examJeeGotRemy.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {
    private static DataConnect INSTANCE;
    private Connection connection;

    private DataConnect() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        
        String url = "jdbc:mysql://localhost:3306/examjeegotremy?serverTimezone=Europe/Paris";
        String user = "root";
        String password = "root";

        try {
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
    }

    public static DataConnect getInstance() throws SQLException {
        if (INSTANCE == null) {
            INSTANCE = new DataConnect();
        }

        return INSTANCE;
    }

    public Connection getConnection() {
        return this.connection;
    }
    
    public void closeConnection() {
        try {
            this.connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}