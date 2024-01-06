package ProxyDesignPattern;

public class Atm implements Account {

	@Override
	public void withraw() {
		BankAccount bank = new BankAccount();
		bank.withraw();
	}

}
