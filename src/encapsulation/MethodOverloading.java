package encapsulation;

public class MethodOverloading {
	
	//Same data type parameters
	public static void product(int a,int b) {
		System.out.println("Result1 "+a*b);
	}
	//different data type of parameters
	public static void product(double a,int b) {
		System.out.println("result2 "+a*b);
	}
	//number of different parameters
	public static void product(int a,int b,int c) {
		System.out.println("result3 "+a*b*c);
	}

	
	public static void main(String[] args) {
		MethodOverloading overloading = new  MethodOverloading();
		overloading.product(4.5, 5);
		overloading.product(6, 2);
		overloading.product(1, 2, 3);
	}
}
