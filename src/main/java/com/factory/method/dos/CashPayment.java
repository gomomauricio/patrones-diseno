package com.factory.method.dos;

public class CashPayment implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println("Pago con efectivo " + amount);
	}

}