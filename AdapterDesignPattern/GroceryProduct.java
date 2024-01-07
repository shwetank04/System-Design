package AdapterDesignPattern;

public class GroceryProduct implements GroceryItem {

	@Override
	public String getItem() {
		return "Oats";
	}

	@Override
	public String getPrice() {
		return "230";
	}

	@Override
	public String getStore() {
		return "Blinkit";
	}

}
