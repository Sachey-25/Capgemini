package Super_Constructor;
public class ParentClass {	
	//COnstructor
	ParentClass(){
		System.out.println("Contructor of parent class");
	}
}
class Subclass extends ParentClass {
	//No-arg constructor
	Subclass(){
		/*Compile/JRE/JVM// ===> implicitly adds super() here as the first statement of this constructor*/
		System.out.println("Constructor of child class");
	}
	//parameterized COnstructor
	Subclass(int num){
		System.out.println("Argument Constructor of child class");
	}
	//Method
	void disp() {
		System.out.println("Hello Guys!!! Take a break.");
	}

	public static void main(String[] args) {
		Subclass object = new Subclass();
		object.disp(); //Constructor of parent class
		Subclass object_two = new Subclass(100);
		object_two.disp();
	}
}