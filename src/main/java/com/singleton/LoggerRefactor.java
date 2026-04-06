package com.singleton;
 

 

public class LoggerRefactor {
	
	 public static void main(String[] args) {
		LoggerEnum.INSTANCE.log("log normal");
		LoggerEnum.INSTANCE.log(LogType.ERROR,"log error");
	}

}
