package inheritance;

public class InheritanceDemo {

	int a;String name;
	
	void show(int b,String Sname) {
		a = b;
		name = Sname;
		System.out.println( "Student name: "+Sname+ "\nRollNo :"+b);
	}

}

class Base extends InheritanceDemo{
	int id;
	void display(int Id) {
		id = Id;
		System.out.println("student id "+Id);
	}
}
