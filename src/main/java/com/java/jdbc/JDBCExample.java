package com.java.jdbc;

import com.selflearning.java8.StreamTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) throws Exception {
        //1. connect

        String url = "jdbc:mysql://localhost:3306/mycompany";
        String user = "root";
        String password = "root";
        //to register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =DriverManager.getConnection(url,user,password);

        //2. query
        //statement interface has method to execute query. so we create object of statement
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from employees;");

        //3. print result
        //rs will point to before first row in the database
        //when we use rs.next(), it will move cursor to next row, the first record and return true
        //if we have data on next row, otherwise it will return false

        while (rs.next()) {
            System.out.println(rs.getString("first_name") +" "+rs.getString("last_name"));
        }

        /*rs.next();
        System.out.println(rs.getString("first_name"));*/



                //4. close the connection between java and database
        con.close();
    }
}
