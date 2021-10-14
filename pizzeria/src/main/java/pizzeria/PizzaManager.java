package pizzeria;

import java.util.ArrayList;

public class PizzaManager {
	
	ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
	
	public Pizza addPizza(Pizza pizza) {
		pizzaList.add(pizza);
		return pizza;
	}
	
	public String removePizza(int index) {
		
		pizzaList.remove(index);
		String result = "Pizza of index: " + index + " has been removed!";
		System.out.println(result);
		return result;
		
	}
	
	public String getPizza(int index) {
		
		Pizza pizzaResult = pizzaList.get(index);
		String pizzaString = pizzaResult.toString();
		System.out.println(pizzaString);
		return pizzaString;
	}
	
	public Pizza updatePizza(int index, Pizza newPizza) {
		
		pizzaList.set(index, newPizza);
		System.out.println("New pizza added");
		return newPizza;
	}
	
	public void getAllPizzas() {
		System.out.println(pizzaList);
		return pizzaList;
	}

}
