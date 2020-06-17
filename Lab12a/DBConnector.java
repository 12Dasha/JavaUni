package Lab12a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    private String url = "jdbc:hsqldb:file:C:/Users/Дарья/IdeaProjects/lab4/sql_scripts/";
    private String user = "user";
    private String password = "mysql123";
    private Connection connection;

    public DBConnector() {
        try {
            Class.forName("com.mysql.jdbc.OracleDriver");
        } catch (ClassNotFoundException var2) {
            System.out.println(var2.getMessage());
        }

    }

    public Connection getConnection() {
        try {
            this.connection = DriverManager.getConnection(this.url, this.user, this.password);
            return this.connection;
        } catch (SQLException var2) {
            System.out.println(var2.getMessage());
            return null;
        }
    }

    public boolean isConnected() {
        try {
            return !this.connection.isClosed();
        } catch (SQLException var2) {
            System.out.println(var2.getMessage());
            return false;
        }
    }

    public void closeConnection() {
        try {
            this.connection.close();
        } catch (SQLException var2) {
            System.out.println(var2.getMessage());
        }

    }
}
