package CompositeDesignPattern;

public class SalesDepartment implements Department {
	
	public String id;
	public String name;
	
	
	
	public SalesDepartment(String id, String name) {
		this.id = id;
		this.name = name;
	}



	@Override
	public void printName() {
		System.out.println("Sales Department");
	}

}
