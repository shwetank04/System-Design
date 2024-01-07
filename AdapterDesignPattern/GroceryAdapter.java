package AdapterDesignPattern;

public class GroceryAdapter implements Item {
	
	private GroceryItem groceryItem;

	public GroceryAdapter(GroceryItem groceryItem) {
		this.groceryItem = groceryItem;
	}

	@Override
	public String getItem() {
		 return groceryItem.getItem();
		
	}

	@Override
	public String getPrice() {
		return groceryItem.getPrice();
	}
	

	@Override
	public String getRestra() {
		return groceryItem.getStore();		
	}
	
	
	
}
