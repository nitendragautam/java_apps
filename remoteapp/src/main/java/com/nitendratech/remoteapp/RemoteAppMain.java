package com.nitendratech.remoteapp;


import com.nitendratech.remoteapp.util.AppUtility;

import java.util.Map;

public class RemoteAppMain {


    public static void main(String args[]){

        String fileLocation = args[0];

       Map<String,String> propMap=AppUtility.readPropertiesFile(fileLocation);

       System.out.println(propMap.get("userName"));

    }

}
