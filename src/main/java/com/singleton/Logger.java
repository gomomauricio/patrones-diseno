package com.singleton;
 

 

public class Logger {
	
	 private static Logger instance;  
	 
	    private Logger() {}
	     
	    public static Logger getInstance() {
	        if(instance == null) {
	        	   synchronized (Logger.class) {
	        		   if (instance == null) {
	        			   	instance = new Logger();
	        		   }
	        	   }
	        }
	        return instance;
	    }

	    public  void log(String message) {
	        System.out.println(message);
	    }
	    
	    public  void log(LogType type, String message)
	    {
	    	switch (type) {
			case ERROR ->  System.err.println(message);
			
			case WARNING -> System.out.println("WARNING:" + message);
			
			default -> System.out.println(message);
				 
			}
	       
	    }

}
