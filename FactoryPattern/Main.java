package FactoryDesignPattern;

public class Main {
	public static void main(String args[]) {
	Pizza pizza = PizzaFactory.getPizza("Cheese");
	pizza.createPizza();
	}
}
