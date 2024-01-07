package AdapterDesignPattern;

public class FoodItem implements Item {

	@Override
	public String getItem() {
		return "Veg Thali";
	}

	@Override
	public String getPrice() {
		return "120";
	}

	@Override
	public String getRestra() {
		return "Just Fresh Point";
	}

}
