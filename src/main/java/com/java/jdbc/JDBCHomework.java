package com.java.jdbc;

import java.sql.*;

public class JDBCHomework {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mycompany";
        String user = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        System.out.println("==========Fetch Employee Order By Age===============");
        fetchEmployeeOrderByAge(statement);
        System.out.println("==========Fetch Unique Countries===============");
        fetchUniqueCountries(statement);
        System.out.println("==========Fetch QA Engineers===============");
        fetchQAEngineers(statement);
        connection.close();
    }

    public static void fetchEmployeeOrderByAge(Statement statement) throws SQLException {
        String query = "select * from employees order by birth_date;";
        ResultSet rs = statement.executeQuery(query);
        //get all data
        ResultSetMetaData r = rs.getMetaData();

       /* int columnIndex =1;
        while (rs.next()){
            System.out.println(r.getColumnLabel(columnIndex));
            columnIndex++;
        }*/

        while (rs.next()){
            for(int i =1; i<=r.getColumnCount();i++) {
                System.out.print(rs.getString(i) + "\t\t");
            }
            System.out.println();
           /* System.out.println(rs.getString("emp_id")+" "+rs.getString("first_name")+" "
                    +rs.getString("birth_date"));*/
        }
    }

    public static void fetchUniqueCountries(Statement statement) throws SQLException {
        String query = "select distinct country from employees;";
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getString("country"));
        }
    }

    public static void fetchQAEngineers(Statement statement) throws SQLException {
        String query = "select emp_id, first_name,description from employees inner join roles on designation_id = role_id " +
                "and description = 'QA Engineer';";
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getString("emp_id")+" "+rs.getString("first_name")+" "+rs.getString("description"));
        }
    }
}
