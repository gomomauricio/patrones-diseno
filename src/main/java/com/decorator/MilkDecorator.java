package com.decorator;


//quitando la implementacion de coffe para que herede del decorador
public class MilkDecorator extends CoffeeDecorator {
	 
	public MilkDecorator(Coffee coffee) {
		super(coffee); 
	}



	@Override
	public double cost() {
		return coffee.cost() + 5;
	}



	@Override
	public String getDescription() {
		 
		return coffee.getDescription() + ", leche";
	}

}
