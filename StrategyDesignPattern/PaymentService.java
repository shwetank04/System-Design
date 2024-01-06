package strategyPattern;

public class PaymentService {

	private PaymentStrategy paymentStrategy;

	public PaymentService(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void doPayment() {
		paymentStrategy.procesPayment();
	}
}
