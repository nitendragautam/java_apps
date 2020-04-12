package com.nitendratech.utilities;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateUtility {
	//Gets Todays Date
	public static String getTodayDate(){
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy:hh:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);    
        return dateFormat.format(cal.getTime());
	}
	
	//Gets Earliest Date
	public static String getEarliestDate(int dayCount){
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy:hh:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -dayCount);    
        return dateFormat.format(cal.getTime());
	}
	

/*
 * *Populates UTC Date
 * 
 */

public static String getUTCDate(){
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
	cal.add(Calendar.DATE, +7); 
	 return dateFormat.format(cal.getTime());
	
}

/*
 * Returns Todays Date with Encoding 
 */
	public static String getTodayURLEncodedDate(){
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy:hh:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);    
        String encodedDate = null;
		try {
			encodedDate = URLEncoder.encode(dateFormat.format(cal.getTime()),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
        return encodedDate;
		
	}
	/*
	 * Gets the Linux Epoch time
	 */
	public static long getLinuxEpochTime(){
		long unixTime = System.currentTimeMillis()/1000L;
		return unixTime;
	}

	
	/*
	 * Gets the Latest linux Epoch Time
	 */
	public static String getLatestEpochTime(){
		long unixTime = System.currentTimeMillis();
		
		
		return String.valueOf(unixTime);
		
	}

	/*
	 * Gets Earliest  Epoch Time
	 */
	public static String getEarliestEpochTime(){
		long unixTime = System.currentTimeMillis();   
	    
	    
	    return String.valueOf(unixTime-86400000);
	   
	}
	


	/*
	Converts Epoch time into different time format

	 */

	public static String getNormalTimeFromEpoch(long epochTime){
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD HH:MM:SS", Locale.US);
        return sdf.format(new Date(epochTime));

	}



	//Gets Todays date in given Pattern
	public static String getDateFromPattern(String datePattern){
		DateFormat dateFormat = new SimpleDateFormat(datePattern);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 0);
		return dateFormat.format(cal.getTime());
	}

	
	public static void main (String args[]){
		System.out.println("Earliest Date 1 Day Count"+DateUtility.getEarliestDate(1));
		System.out.println("Earliest Date 2 Days Count"+DateUtility.getEarliestDate(2));
		System.out.println("Todays Date "+DateUtility.getTodayDate());
		System.out.println("UTC Date "+DateUtility.getUTCDate());

		System.out.println("URL Encoded Date "+DateUtility.getTodayURLEncodedDate());
		System.out.println("Linux Epoch Time "+DateUtility.getLinuxEpochTime());


		System.out.println("Time from Epoch time format "+DateUtility.getNormalTimeFromEpoch(1493853393));
		System.out.println("Date in Different Pattern "+DateUtility.getDateFromPattern("dd/MMM/yyyy:HH:mm:ss Z"));
	}
}
