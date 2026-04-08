package com.observer;

import java.util.ArrayList;
import java.util.List;

public class Product_Observer 
{
	
	 private List<Observer> observers = new ArrayList<>();

	    public void addObserver(Observer o) {
	        observers.add(o);
	    }

	    public void notifyObservers(String product) {
	        for (Observer o : observers) {
	            o.update(product);
	        }
	    }
	    
	    public void unsubscribe(Observer o)
	    {
	    	observers.remove(o);
	    }
	    
	    
//	    public void notifySelectUsers(List<Observer> vips, String product)
//	    {
//	    	 for (Observer o : vips) {
//		            o.update(product);
//		        }
//	    }

}
