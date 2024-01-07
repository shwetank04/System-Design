package AdapterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class SwiggyStore {
	public List<Item> items = new ArrayList<>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public List<Item> getItem() {
		return items;
	}
}
