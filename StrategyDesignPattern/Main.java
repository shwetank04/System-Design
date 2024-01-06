package strategyPattern;

public class Main {

	public static void main(String[] args) {
		PaymentByCard card = new PaymentByCard();
		PaymentService paymentService = new PaymentService(card);
		paymentService.doPayment();
	}

}

