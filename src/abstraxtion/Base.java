package abstraxtion;

//abstract class declared with abstract key-word
// an abstract class contain both abstract and concrete methods
// abstract class can allow constructor.
//Abstract class and methods can not be final.
public abstract class Base {
	
	
	public void show() {// concrete methods, it having body.
		System.out.println("Hi students ");
	}
	abstract void print();// abstract method this methods not having body.
	
	
}

class Child extends Base {

	@Override
	void print() {
		System.out.println("Welcom to Bridgelabz");
		
	}

	
}

