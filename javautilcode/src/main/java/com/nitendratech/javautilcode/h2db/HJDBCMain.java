package com.nitendratech.javautilcode.h2db;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by @author nitendratech on 1/24/24
 */
public class HJDBCMain {

  final static String createTableSQL = "create table users (\r\n" + "  id  int(3) primary key,\r\n" +
      "  name varchar(20),\r\n" + "  email varchar(20),\r\n" + "  country varchar(20),\r\n" +
      "  password varchar(20)\r\n" + "  );";

  public static void main(String [] args){

    H2JdbcUtils h2JdbcUtils = new H2JdbcUtils();

    Connection connection =H2JdbcUtils.getConnection();

    try {
      System.out.println("connection.isValid(0) "+connection.isValid(0));
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }

    // h2JdbcUtils.createTable(createTableSQL);


  }
}
