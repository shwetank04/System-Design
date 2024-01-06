package DecoratorDesignPattern;

public class CheeseBurstDecorator extends PizzaDecorator {

	public CheeseBurstDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public String bake() {
		// TODO Auto-generated method stub
		return pizza.bake() + addCheese();
	}
	
	public String addCheese() {
		return "Cheese";
	}

}
