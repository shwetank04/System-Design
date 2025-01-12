package main;

public class Main {

	public static void main(String[] args) {
		SportsVechile vechile = new SportsVechile();
		vechile.drive();
	}
}

package main;

public class Vechile {
	DriveStrategy obj;

	public Vechile(DriveStrategy obj) {
		this.obj = obj;
	}
	
	void drive() {
		obj.drive(); 
	}
}

package main;

public interface DriveStrategy {
	void drive();
}

package main;

public class SportsVechile extends Vechile {

	public SportsVechile() {
		super(new SportsDrive());
	}
}

package main;

public class SportsDrive implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Sports Drive Strategy");
	}

}

