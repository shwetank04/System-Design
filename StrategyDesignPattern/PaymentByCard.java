package strategyPattern;

public class PaymentByCard implements PaymentStrategy {

	@Override
	public void procesPayment() {
		System.out.println("Payment done by Card");		
	}

}
