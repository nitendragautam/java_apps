package com.nitendratech.javautilcode.csvfileutility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by @author nitendratech on 1/23/24
 */
public class CSVFileReader {
  static String csvFile ="src/main/resources/Sales_Records_data.csv";



  public static void main(String [] args) throws IOException {

    // List to Store the Data
    List<List<String>> csvData = new ArrayList<>();

    // Read File

    BufferedReader br = new BufferedReader(
        new FileReader(csvFile));

    // Read the file line by line

    String line;
    while ((line = br.readLine()) != null){

      //Split the line into Columns
      String [] columns  = line.split(",");

      // Add the columns to the data list
      csvData.add(new ArrayList<>(Arrays.asList(columns)));
    }
    // Close the BufferReader
    br.close();

    // Print CSV Data

    for ( List<String> row: csvData){
      for(String column: row){
        System.out.print(column + ", ");
      }
      System.out.println();
    }

  }


}
