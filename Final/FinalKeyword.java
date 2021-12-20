package Final;

class finalclass{
	final int value;
	
	// It must be initialized to the constructor.
	finalclass() {
		value=101;
	}
	//We can the method and method body..!!
	void demo() {
		System.out.println(value);
	}
}
public class FinalKeyword {
	public static void main(String[] args) {
	finalclass ob=new finalclass(); //Object is been created for the class
	System.out.println(ob.value); // Printing the value.
	ob.demo(); //Calling the method
	}
}
