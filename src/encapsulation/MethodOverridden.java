package encapsulation;

public class MethodOverridden {
	// static methods not support overridden
	void display() {
		System.out.println("hi welcom");
	}

}

class Base extends MethodOverridden {
	void display() {
		System.out.println("to bridgelabz");
	}
}
