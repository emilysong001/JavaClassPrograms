package com.java.jdbc;
import java.sql.*;
//Make sure to replace the following placeholders in the code:
//hostname with the hostname of the MySQL server
//port with the port number where the MySQL server is listening
//dbname with the name of the database
//username with the username used to connect to the database
//password with the password used to connect to the database
//Also, ensure that you have the MySQL Connector/J JDBC driver JAR file in your classpath.

public class mySqlConnection {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://hostname:port/dbname";
    static final String USER = "username";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT column1, column2, column3 FROM table";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("column1");
                String name = rs.getString("column2");
                String lastName = rs.getString("column3");
                System.out.println("ID: " + id + ", Name: " + name + ", Last Name: " + lastName);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
