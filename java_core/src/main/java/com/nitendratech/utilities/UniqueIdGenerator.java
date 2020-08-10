package com.nitendratech.utilities;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


/**
 * Created by @author nitendratech on 8/10/20
 */
public class UniqueIdGenerator {

    public static String getSequenceBasedDate(){

        long initVal = Long.valueOf(LocalDateTime.now().format(DateTimeFormatter.BASIC_ISO_DATE)) * 10000;

        return String.valueOf(initVal);
    }




    public static String getSequenceBasedDateTime() {
        long initVal = Long.valueOf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"))) * 10;


        return String.valueOf(initVal);

    }


    public static String getTimeStamp() {
        Instant instant = Instant.now();
        long timeStampMillis = instant.toEpochMilli();
        return String.valueOf(timeStampMillis);
    }

    public static String getEpoch() {
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(0);
        c.set(2008, 0, 1, 0, 0, 0);
        c.set(Calendar.MILLISECOND, 0);
        c.set(Calendar.ZONE_OFFSET, 0);
        c.set(Calendar.DST_OFFSET, 0);
        long retval = c.getTimeInMillis();
        return String.valueOf(retval);
    }



    public static void main(String[] args){

      //  System.out.println(getSequenceBasedDate());




        for(int i =0; i<100;i++) {

           System.out.println(getTimeStamp());
           // System.out.println(getEpoch());

            //System.out.println(Long.parseLong(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"))) * 10);


        }

    }


}
