package com.nitendratech.javautilcode.h2db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by @author nitendratech on 1/24/24
 */
public class H2JdbcUtils {

  private static String jdbcURL = "jdbc:h2:mem:test";

  public static Connection getConnection(){
    Connection connection = null;


    try {
      connection = DriverManager.getConnection(jdbcURL);
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return connection;
  }

  public void createTable(String createTableSQL){

    // Get Connection
    Connection connection = getConnection();

    try {
      Statement statement = connection.createStatement();

      //Execute SQL
      statement.execute(createTableSQL);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }

  }


}
