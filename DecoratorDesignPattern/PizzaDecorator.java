package DecoratorDesignPattern;

public abstract class PizzaDecorator implements Pizza {
	protected Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	public String bake() {
		// TODO Auto-generated method stub
		return pizza.bake();
	}

}
