package Interface;

class Test {
	public static void main(String[] args) {
		//creating an interface bicycle
		Bicycle bicycle = new  Bicycle();
		bicycle.changeGare(2);
		bicycle.sppedUp(5);
		bicycle.applyBreakes(1);
		
		System.out.println("Bicycle present state is ");
		bicycle.printState();
		
		Bick bick = new Bick();
		bick.changeGare(3);
		bick.sppedUp(25);
		bick.applyBreakes(1);
		
		System.out.println("Bick present state is ");
		bick.printState();
		
		
	    //We can't create object for interface
		//We can create object for class interface
		//A class can implements more than one interface
	}
}