package mx.edu.utez.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    public class mySQLConnection {
        public Connection getConnection() {
            final String DBNAME = "pokemon",
                    USERNAME = "root",
                    PASSWORD = "root",
                    TIMEZONE = "America/Mexico_City",
                    USESSL = "false",
                    PUBLICKEY = "true";
            String dataSource = String.format("jdbc:mysql://localhost:3306/%s?user=%s" +
                            "&password=%s&serverTimezone=%s&useSSL=%s&allowPublicKeyRetrieval=%s",
                    DBNAME, USERNAME, PASSWORD, TIMEZONE, USESSL, PUBLICKEY);
            try {
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                return DriverManager.getConnection(dataSource);
            } catch (SQLException e) {
                System.out.println(this.getClass().getCanonicalName() +
                        "->" + e.getMessage());
            }
            return null;
        }
    }
}
