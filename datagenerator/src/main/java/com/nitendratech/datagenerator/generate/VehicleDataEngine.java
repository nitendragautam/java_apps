package com.nitendratech.datagenerator.generate;

import java.util.List;


import com.nitendratech.datagenerator.vo.VehicleData;


/**
 *
 * @author nitendragautam
 *
 * Generates Vehicle Data
 *
 */
public class VehicleDataEngine {



    public static void main(String args[]){


        VehicleDataGenerator vGenerator = new VehicleDataGenerator(200);
        //Generate Vehicle Data

        List<VehicleData> vehicleDataList = vGenerator.getVehicleData();


        vehicleDataList.stream().forEach(vehicleItem -> {
            System.out.println(vehicleItem.toString());
        });
    }




}
