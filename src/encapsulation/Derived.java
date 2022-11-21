package encapsulation;

class Derived{
	public static void main(String[] args) {
		MethodOverridden  overridden = new MethodOverridden();
		overridden.display();
		Base base = new  Base();
		base.display();
	}
}