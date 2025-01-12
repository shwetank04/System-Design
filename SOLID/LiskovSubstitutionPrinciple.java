package main;

public interface Bike {
	
	void accelerate();
	
}

package main;

public class MotorCycle implements Bike {

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.print("Able to Accelerate");
	}

}

package main;

public class Cycle implements Bike {

	@Override
	public void accelerate() {
		throw new AssertionError("Cant accelerate");
	}

}
