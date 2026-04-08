package com.decorator;

public class Implementacion {
	
	public class Main {
	    public static void main(String[] args) {
	        // 1. Empezamos con un café simple
	        Coffee miCafe = new BasicCoffee();
	        
	        // 2. Le agregamos leche (suponiendo que actualizaste MilkDecorator)
	        miCafe = new MilkDecorator(miCafe);
	        
	        // 3. Le agregamos caramelo
	        miCafe = new CaramelDecorator(miCafe);

	        // Imprimimos el resultado final
	        System.out.println("Pedido: " + miCafe.getDescription());
	        System.out.println("Costo total: $" + miCafe.cost());
	    }
	}

}
