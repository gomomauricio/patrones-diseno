package com.strategy.one;

public class VipDiscount implements DiscountStrategy {

	@Override
	public double getPriceDiscount(double price) {
		// TODO Auto-generated method stub
		return price * 0.8;
	}

}
