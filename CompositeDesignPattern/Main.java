package CompositeDesignPattern;

public class Main {

	public static void main(String[] args) {
		Department sales = new SalesDepartment("1","sales");
		HeadDepartment head = new HeadDepartment("2","head");
		head.addDepartment(sales);
		head.print();
	}

}
