package com.strategy.one;

public class NormalDiscount implements DiscountStrategy {

	@Override
	public double getPriceDiscount(double price) {
		// TODO Auto-generated method stub
		return price * 0.9;
	}

}
