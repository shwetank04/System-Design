package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
	public String id;
	public String name;
	public List<Department> department = new ArrayList<>();

	public HeadDepartment(String id, String name) {
		this.id = id;
		this.name = name;
		this.department = new ArrayList<>();
	}

	@Override
	public void printName() {
		System.out.println("Head Department");
	}
	
	public void addDepartment(Department depart) {
		this.department.add(depart);
	}
	
	public void removeDepartment(Department depart) {
		this.department.remove(depart);
	}
	
	public void print() {
		department.forEach(Department::printName);
	}

}
