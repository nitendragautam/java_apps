package com.nitendratech.sparkgeneral.util;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.Metadata;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @author nitendratech on 5/15/20
 */
public class GenerateDataSets {



    public static Dataset<Row> getInitialDataSets(SparkSession sparkSession){

        //Declaring all the Schema of the Data
        StructField[] structFields = new StructField[]{
                new StructField("transaction_id", DataTypes.IntegerType,true, Metadata.empty()),
                new StructField("t_primary_key", DataTypes.IntegerType,true, Metadata.empty()),
                new StructField("firstName", DataTypes.StringType,true, Metadata.empty()),
                new StructField("lastName", DataTypes.StringType,true, Metadata.empty()),
                new StructField("salary", DataTypes.IntegerType,true, Metadata.empty()),
                new StructField("office_location", DataTypes.StringType,true, Metadata.empty()),
                new StructField("effective_date", DataTypes.StringType,true, Metadata.empty())
        };

        StructType structType = new StructType(structFields);
        List<Row> inRows = new ArrayList<>();

        inRows.add(RowFactory.create(1,14111,"John", "Wick", 400000,"New Jeresy","20180116"));
        inRows.add(RowFactory.create(2,14112,"John", "Doe", 2000,"California",20190122));
        inRows.add(RowFactory.create(3,14113,"Tim", "Cook", 50000,"San Fransisco",20170126));
        inRows.add(RowFactory.create(4,14114,"Jet", "Lee", 20000,"Hong Kong",20200119));
        inRows.add(RowFactory.create(5,14115,"Donnie", "Yen", 250000,"Los Angeles",20190216));
        inRows.add(RowFactory.create(6,14116,"Ram", "Narayan", 90000,"Baikuntha",20170818));
        inRows.add(RowFactory.create(7,14117,"John", "Doe", 2000,"California",20181018));


        //Create a DataSet from Input Data
        Dataset<Row> inputDF = sparkSession.createDataFrame(inRows,structType);

        return inputDF;
    }




    public static Dataset<Row> getDeltaRecords(SparkSession sparkSession){

        //Declaring all the Schema of the Data
        StructField[] structFields = new StructField[]{
                new StructField("transaction_id", DataTypes.IntegerType,true, Metadata.empty()),
                new StructField("t_primary_key", DataTypes.IntegerType,true, Metadata.empty()),
                new StructField("firstName", DataTypes.StringType,true, Metadata.empty()),
                new StructField("lastName", DataTypes.StringType,true, Metadata.empty()),
                new StructField("salary", DataTypes.IntegerType,true, Metadata.empty()),
                new StructField("office_location", DataTypes.StringType,true, Metadata.empty()),
                new StructField("effective_date", DataTypes.StringType,true, Metadata.empty())
        };

        StructType structType = new StructType(structFields);
        List<Row> inRows = new ArrayList<>();

        inRows.add(RowFactory.create(8,14111,"John", "Wick", 400000,"New Jersey",20190101));
        inRows.add(RowFactory.create(9,14114,"Jet", "Lee", 50000,"Los Angeles",20200119));


        //Create a DataSet from Input Data
        Dataset<Row> inputDF = sparkSession.createDataFrame(inRows,structType);

        return inputDF;
    }

    public static StructType getWarehouseTableSchema(){

        //Declaring all the Schema of the Data
        StructField[] structFields = new StructField[]{
                new StructField("transaction_id", DataTypes.IntegerType,true, Metadata.empty()),
                new StructField("t_primary_key", DataTypes.IntegerType,true, Metadata.empty()),
                new StructField("firstName", DataTypes.StringType,true, Metadata.empty()),
                new StructField("lastName", DataTypes.StringType,true, Metadata.empty()),
                new StructField("salary", DataTypes.IntegerType,true, Metadata.empty()),
                new StructField("office_location", DataTypes.StringType,true, Metadata.empty()),
                new StructField("effective_date", DataTypes.StringType,true, Metadata.empty()),
                new StructField("to_date", DataTypes.StringType,true, Metadata.empty()),
                new StructField("active_flag", DataTypes.StringType,true, Metadata.empty())
        };

        return new StructType(structFields);

    }


    public static Dataset<Row> getTargetTableData(SparkSession sparkSession){

        //Declaring all the Schema of the Data
        StructField[] structFields = new StructField[]{
                new StructField("transaction_id", DataTypes.IntegerType,true, Metadata.empty()),
                new StructField("t_primary_key", DataTypes.IntegerType,true, Metadata.empty()),
                new StructField("firstName", DataTypes.StringType,true, Metadata.empty()),
                new StructField("lastName", DataTypes.StringType,true, Metadata.empty()),
                new StructField("salary", DataTypes.IntegerType,true, Metadata.empty()),
                new StructField("office_location", DataTypes.StringType,true, Metadata.empty()),
                new StructField("effective_date", DataTypes.StringType,true, Metadata.empty()),
                new StructField("to_date", DataTypes.StringType,true, Metadata.empty()),
                new StructField("active_flag", DataTypes.StringType,true, Metadata.empty())
        };


        StructType structType = new StructType(structFields);
        List<Row> inRows = new ArrayList<>();

        inRows.add(RowFactory.create(8,14111,"John", "Wick", 400000,"New Jersey",20190101,20190101,"Y"));
        inRows.add(RowFactory.create(9,14114,"Jet", "Lee", 50000,"Los Angeles",20200119,20190101,"Y"));


        //Create a DataSet from Input Data
        Dataset<Row> inputDF = sparkSession.createDataFrame(inRows,structType);

        return inputDF;


    }


}