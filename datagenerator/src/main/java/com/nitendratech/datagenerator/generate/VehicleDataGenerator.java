package com.nitendratech.datagenerator.generate;


import com.nitendratech.datagenerator.common.ApplicationUtility;
import com.nitendratech.datagenerator.vo.VehicleData;

import java.sql.Timestamp;
import java.util.*;
import java.util.Random;

/**
 * Generates the Simulated Vehicle Data
 *
 *
 *
 */
public class VehicleDataGenerator {

    private int DATA_LIMIT_DEFAULT_VALUE=1000;

         int DATA_LIMIT;

    public VehicleDataGenerator(){
        DATA_LIMIT=DATA_LIMIT_DEFAULT_VALUE;

    }

    public VehicleDataGenerator(int dataLimit){

        this.DATA_LIMIT =dataLimit;

    }


    public List<VehicleData> getVehicleData(){


        List<String> routeList = Arrays.asList(new String[]{"US-51","US-180","US-64","US-95"});

        List<String> vehicleTypeList = Arrays.asList(new String []{
           "Passenger Car","SUV","Heavy Duty Truck","Medium Duty Truck","Bus","Taxi"});

        Random random = new Random();
        List<VehicleData> vehicleDataList = new ArrayList<VehicleData>();


        for (int vehicleCount= 0; vehicleCount < DATA_LIMIT; vehicleCount ++){

            String vehicleId = UUID.randomUUID().toString();
            String vehicleType = vehicleTypeList.get(random.nextInt(vehicleTypeList.size()));


            //Creating events for data sets

            for (int eventCount = 0; eventCount < 6; eventCount++){
                String routeId = routeList.get(random.nextInt(4));

                //Get current timestamp in YYYY-MM-DD HH:MM:SS format
                Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
                double vehicleSpeed = getRandomNumbersInRange(10,120);
                double fuelLevel = getRandomNumbersInRange(2,11);
                int outsideTemperature = getRandomNumbersInRange(10,70);
                int engineTemperature = getRandomNumbersInRange(20,200);



               Map<String,Float> coordinates = getRandomCoordinates(routeId, routeList);

                String latitude = coordinates.get("latitude").toString();
                String longtitude = coordinates.get("longitude").toString();

                /**
                 * String vehicleId, String vehicleType, String routeId, String latitude, String longitude,
                 * Timestamp timeStamp, double vehicleSpeed, double fuelLevel, int outsideTemperature,
                 * int engineTemperature
                 */
                VehicleData vehicleData = new VehicleData(vehicleId, vehicleType,routeId,latitude,longtitude,timeStamp,vehicleSpeed, fuelLevel,outsideTemperature,engineTemperature);

                vehicleDataList.add(vehicleData);

            }

            Collections.shuffle(vehicleTypeList);


        }

        return vehicleDataList;

    }



    private static int getRandomNumbersInRange(int minBound,int maxBound){


        return new Random().nextInt(maxBound) +minBound;

    }


    /**
     * Generates Random Coordinates
     * @param routeId
     * @param routeList
     * @return
     */
    private static Map<String,Float> getRandomCoordinates(String routeId, List<String> routeList){

        Map<String,Float> coordinatesMap= new HashMap<String,Float>();

        Random ran = new Random();

        int initLatitude=0;
        int initLongitude=0;

        if (routeId.equals(routeList.get(0))) {
            initLatitude = 45;
            initLongitude = -96;
        }
        else if (routeId.equals(routeList.get(1))) {
            initLatitude = 40;
            initLongitude = -92;
        }
        if (routeId.equals(routeList.get(2))) {
            initLatitude = 41;
            initLongitude = -95;
        }
        if (routeId.equals(routeList.get(3))) {
            initLatitude = 43;
            initLongitude = -97;
        }

        coordinatesMap.put("latitude",initLatitude +ran.nextFloat());
        coordinatesMap.put("longitude", initLongitude +ran.nextFloat());

        return coordinatesMap;

    }

}
