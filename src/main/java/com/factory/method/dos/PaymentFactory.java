package com.factory.method.dos;

public class PaymentFactory{
	
    public static Payment payment(PaymentCustomer type) {
        return switch (type) {
        case CREDIT -> new CreditPayment();
        case PAYPAL -> new PaypalPayment();
        case CASH -> new CashPayment();
    };
}
}