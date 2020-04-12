package com.nitendratech.mapreduceapps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtility {

	//Gets Todays Date

	public static String geTodayDate(){
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy-hh-mm-ss");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 0);
		
		return dateFormat.format(cal.getTime());
		
	}
	
}
