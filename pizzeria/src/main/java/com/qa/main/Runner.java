package com.qa.main;

import pizzeria.Pizza;
import pizzeria.PizzaManager;

public class Runner {
	
	public static void main(String[] args) {
		
		PizzaManager manager = new PizzaManager();
		
		manager.addPizza(new Pizza(false, 5, "pepperoni"));
		manager.addPizza(new Pizza(true, 20, "olives"));
		
		manager.getAllPizzas();
		
	}

}
