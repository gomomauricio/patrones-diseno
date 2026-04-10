package com.adapter;

public class PaymentAdapter implements Payment {
	
	private OldPaymentSystem oldSystem;

    public PaymentAdapter(OldPaymentSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

	@Override
	public void pay(double amount) {
		 oldSystem.makePayment((int) amount);
	}

}
