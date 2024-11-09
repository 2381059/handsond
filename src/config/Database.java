package config;

import java.sql.Connection;

public class Database {
    private final String
    private final String
    private final String
    private final String
    private final String
    private Connection

    public Database(final String dbname, final String username, final String password, final String host, final String port) {
        this.dbName = dbName;
        this.userName = userName;
        this.password = password;
        this.host = host;
        this.port = port
    }

    public Connection getConnection() {
        return Connection;
    }

    public void setup()
        String mysqlConnUrlTemplate = "jdbc:mysql://%s:%";

    // Error Handling
    try {
        Class.forName("com.myql.jdbc.Driver");
        connection = DriverManager.getConnection( String.format(mysqlConnUrTemplate)) {
        System.out.println("Database connected !");
    } Catch (SQLException  ClassNotFoundException e) {
            throw new RuntineException(e);

        }


}
