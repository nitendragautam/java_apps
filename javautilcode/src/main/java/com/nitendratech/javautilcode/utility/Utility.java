package com.nitendratech.javautilcode.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by @author nitendratech on 1/23/24
 */
public class Utility {


    /**
     * Returns the Map of Key/Value Pairs
     * @param fileLocation
     * @return
     */
    public static Map<String,String> readPropertiesFile(String fileLocation){

        Map<String,String> propMap= new HashMap<String,String>();
        try {

            File file = new File(fileLocation);

            FileInputStream fileInp = new FileInputStream(file);

            Properties properties = new Properties();

            properties.load(fileInp);
            fileInp.close();


            Enumeration enKeys = properties.keys();

            while (enKeys.hasMoreElements()){
                String key = (String) enKeys.nextElement();

                String value = properties.getProperty(key);

                propMap.put(key,value);
            }
        }

        catch (FileNotFoundException e){e.printStackTrace();}
        catch (IOException e1){e1.printStackTrace();}


        return propMap;
    }
}
