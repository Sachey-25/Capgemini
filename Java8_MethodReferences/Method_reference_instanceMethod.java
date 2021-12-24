package Java8_MethodReferences;

interface MyInterface{
	//Instance method - of an interface
	void display();
}
class Example{
	//class - instance method
	public void myMethod() {
		System.out.println("Instance Method..!");
	}
}
//Note: Concatenating the one object to another object <-- Method reference
//Concatenating the interface object to instance method <---- method reference
//Concatenating the interface object to class object <---- Method reference.
public class Method_reference_instanceMethod {
	public static void main(String[] args) {
		//Create an object to the class
		Example obj = new Example();
		//Method reference using the object of the class 
		MyInterface ref = obj::myMethod;
		//Calling the method of functional interface
		ref.display();
	}
}
