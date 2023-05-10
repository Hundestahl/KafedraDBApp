package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMSQLS {
        private static final String instanceName = "localhost:1433";
        private static final String databaseName = "Lr2Kafedra";
        private static final String userName = "loginOne";
        private static final String pass = "passOne";
        private static final String connectionUrl = "jdbc:sqlserver://%1$s;databaseName=%2$s;user=%3$s;password=%4$s;encrypt=true;trustServerCertificate=true";
    
        public static Connection connectToDb() throws ClassNotFoundException, SQLException {
        String connectionString = String.format(connectionUrl, instanceName, databaseName, userName, pass);
        Connection connection = DriverManager.getConnection(connectionString);
        return connection;
    }
}
