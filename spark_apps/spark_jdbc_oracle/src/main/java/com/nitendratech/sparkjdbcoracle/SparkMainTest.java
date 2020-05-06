package com.nitendratech.sparkjdbcoracle;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

/**
 * Created by @author nitendratech on 5/6/20
 */
public class SparkMainTest {

    public static void main(String args[]){

        Logger.getLogger("org").setLevel(Level.ERROR);
        SparkSession sparkSession = SparkSession
                .builder()
                .appName("SparkMainTest")
                .master("local[2]")
                .getOrCreate();

        String jdbcUrl ="jdbc:oracle:thin:ot/admin123@//localhost:1521/xe";
        String userName ="ot";
        String passWord="admin123";
        String inputTable="employees";
        String outputTable="employees_test";


        SparkJDBCUtils sparkJDBCUtils = new SparkJDBCUtils(jdbcUrl,userName,passWord);

        // Read from Oracle Table using Load Method
        Dataset<Row> inputRowM1 = sparkJDBCUtils.readUsingLoad(sparkSession,inputTable);

        // Print the Load Method Schema
        inputRowM1.printSchema();

        Dataset<Row> inputRowM2 = sparkJDBCUtils.readUsingJDBCMethod(sparkSession,inputTable);

        // Print the JDBC Method Schema
        inputRowM2.printSchema();

        // Test the Write Method

        //sparkJDBCUtils.writeUsingJDBC(inputRowM1,outputTable);
        sparkJDBCUtils.writeUsingSave(inputRowM1,outputTable,"append");



    }


}
