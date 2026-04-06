package com.factory.method.dos;

public class CreditPayment implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println("Pago con tarjeta de credito " + amount);
	}

}
