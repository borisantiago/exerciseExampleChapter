package com.libreria.libreria.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    private final String url = "jdbc:h2:mem:libreria;DB_CLOSE_DELAY=-1";
    private final String user = "sa";
    private final String password = "";

    private DatabaseConnection() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }

    public static synchronized DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
