package Final;

class FinalMethodClass{
	
	//Creating final method
	final void finalMethod() {
		System.out.println("FinalMethod");
	}
}
// A=B=C A=C << WE CAN'T DO THIS,,,,,, FINAL METHOD!!!
public class FinalMethod extends FinalMethodClass {
	void demo() {
		System.out.println("Final class method");
	}
	public static void main(String[] args) {
		
		FinalMethod ob = new FinalMethod();
		//Using the subclass I am trying to access parent class
		ob.demo();
		ob.finalMethod();
		//Trying to reference parent class for method override
		//Parent to parent 
		FinalMethodClass obj = new FinalMethodClass();
		obj.finalMethod();
		//FinalMethodClass object = new FinalMethod();
		object.demo();
	}
}
