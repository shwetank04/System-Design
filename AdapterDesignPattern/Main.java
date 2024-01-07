package AdapterDesignPattern;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		SwiggyStore store = new SwiggyStore();
		FoodItem food = new FoodItem();
		GroceryProduct product = new GroceryProduct();
		store.addItem(food);
		store.addItem(new GroceryAdapter(product));
		List<Item> items = store.getItem();
		for(Item item:items) {
			System.out.println(item.getItem());
		}
	}

}
