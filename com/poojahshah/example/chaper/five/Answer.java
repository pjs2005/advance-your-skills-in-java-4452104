package com.poojahshah.example.chaper.five;

class Answer {
    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    }
}


// complete and modify this code making it a singleton
class DatabaseConnection {

    private static volatile DatabaseConnection instance;

    private String databaseURL;

    private DatabaseConnection(String databaseURL) {
        if (instance != null) {
            throw new IllegalStateException("Instance is already created");
        }
        this.databaseURL = databaseURL;
    }

    public static void setDatabaseURL(String databaseURL) {
        databaseURL = databaseURL;
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection("jdbc:mysql://localhost:3306/mydatabase");
                }
            }
        }
        return instance;
    }

    // dummy implementation of executing a query
    public void executeQuery(String query) {
        System.out.println("Executing query on " + databaseURL + ": " + query);
    }

    // dummy implementation of closing the connection
    public void close() {
        System.out.println("Closing connection with: " + databaseURL);
    }
}
