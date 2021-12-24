package Java8_MethodReferences;

@FunctionalInterface
interface Second{
	//Interface method 
	void display();
}
class Capgemini{
	//Instance method of the class
	public void disp() {
		System.out.println("My name is Method Reference");
		System.out.println("Hello to the world..!!");
		System.out.println("How are you doing....!");
	}
	Capgemini(){
			System.out.println("Default constructor");
		}
	}
public class AnotherExample_MethodReference {
	public static void main(String[] args) {
		//Create an object to class
		Capgemini capg = new Capgemini();
		//Method reference using the object of the class
		Second sec = capg::disp;
		//Calling the method of functional interface
		sec.display();
		//Method reference to the constructor
		Second ref = Capgemini::new;
		ref.display();
	}
}//Note : Method reference :----> Using class object calling the interface method
// Wherever you find the methods just reach them up..!!! that's nothing but a method reference.