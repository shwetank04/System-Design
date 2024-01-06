package FactoryDesignPattern;

public class CheesePizza implements Pizza {

	@Override
	public void createPizza() {
		System.out.println("Cheese Pizza Returned");
	}

}
