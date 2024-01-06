package FactoryDesignPattern;

public class PizzaFactory {
	public static Pizza getPizza(String pizzaType) {
		Pizza pizza = null;
		if("Cheese".equals(pizzaType)) {
			return new CheesePizza();
		}
		 return pizza;
	}
}
