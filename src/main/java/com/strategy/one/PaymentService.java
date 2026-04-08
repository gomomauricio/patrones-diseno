package com.strategy.one;

public class PaymentService {
	
	 private PaymentStrategy strategy;
	 private DiscountStrategy discountStrategy;

	    public PaymentService(PaymentStrategy strategy, DiscountStrategy discountStrategy) {
	        this.strategy = strategy;
	        this.discountStrategy = discountStrategy;
	    }

	    public void process(double amount)
	    {
	    	double total = discountStrategy.getPriceDiscount(amount); 
	    	
	        strategy.pay(total);
	    }
	    
	   

}
