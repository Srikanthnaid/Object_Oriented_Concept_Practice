package Interface;


// interface having all Abstraction methods
public  interface  Vehicle {
	// in interface variables are in "final,public and static" that means that value not change.
	int a = 10;
	// this abstraction methods are not having implementations i.e = not having body
	// before method using abstract key word
	// interface having only one access specifier public
	// interface can't support constructor.
	//An interface can not having concrete methods.

	abstract public void changeGare(int a);

	abstract public void sppedUp(int a);

	abstract public void applyBreakes(int a);
	
}

class Bicycle implements Vehicle {
	int speed;
	int gear;

	// abstract method must be implements in sub-classes
	@Override
	public void changeGare(int newGear) {
		gear = newGear;

	}

	@Override
	public void sppedUp(int increment) {
		speed = speed + increment;

	}

	@Override
	public void applyBreakes(int decrement) {
		speed = speed - decrement;

	}

	public void printState() {
		System.out.println("spped " + speed + " gears " + gear);

	}

}

class Bick implements Vehicle {
	int speed;
	int gear;

	@Override
	public void changeGare(int newGear) {
		gear = newGear;

	}

	@Override
	public void sppedUp(int increment) {
		speed = speed + increment;

	}

	@Override
	public void applyBreakes(int decrement) {
		speed = speed - decrement;

	}

	public void printState() {
		System.out.println("Spped " + speed + " gear " + gear);

	}

}
