package com.singleton;

 
import java.util.Date;

public enum LoggerEnum {
	
	 INSTANCE;
	
	private Date date;

    public void log(String message) 
    {
    	date =  new Date();
        System.out.println( date + ":" +  message);
    }
    
    public void log(LogType type, String message)
    {
    	date =  new Date();
    	switch (type) {
		case ERROR ->  System.err.println("ERROR: " + date + ":" + message);
		case WARNING -> System.out.println("WARNING: " + date + ":" + message);
		case INFO -> System.out.println("INFO: " + date + ":" + message);
		}
    }

}
