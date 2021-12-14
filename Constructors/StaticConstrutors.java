package JavaOOP.Constructors;

public class StaticConstrutors {
	static {
		System.out.println("static block of parent class");
	}
	public static void main(String[] args) {
		StaticChildClass obj = new StaticChildClass();
		obj.display();
	}
}
class StaticChildClass extends StaticConstrutors{
	static {
		System.out.println("static block of child class");
	}
	public void display() {
		System.out.println("Method from child class");
	}	
}

