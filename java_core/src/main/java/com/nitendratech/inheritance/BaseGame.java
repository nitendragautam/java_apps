package com.nitendratech.inheritance;

public class BaseGame {
	
	private static boolean status = true;
	
    public static boolean playCricket(){
    	status = false;
    	return status;
    }
    
    
    public static boolean playFootBall(){
    	status = true;
    	
    	return status;
    }
	
	
	

}
