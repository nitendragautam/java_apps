package com.nitendratech.javautilcode.remotework;

import com.nitendratech.javautilcode.utility.Utility;

import java.util.Map;

/**
 * Created by @author nitendratech on 1/23/24
 */
public class RemoteAppMain {
    public static void main(String args[]){

        String fileLocation = args[0];

        Map<String,String> propMap= Utility.readPropertiesFile(fileLocation);

        System.out.println(propMap.get("userName"));

    }

}
