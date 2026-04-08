package com.observer;

public class User_Observer implements Observer {

	@Override
	public void update(String product) {
		  System.out.println("Notificado: " + product);
	}

}
