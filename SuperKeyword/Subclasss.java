package SuperKeyword;

public class Subclasss extends ParentClass {
	
	//Overriding Method
	void display() {
		System.out.println("Child Method..!");//stop 
		
	}
	//General method<--- For differentiation purpose
	void PrintMsg() {
		//This would call overriding method
		display();
		//This would call overriding method to the parent class
		super.display();
	}
	public static void main(String[] args) {
		Subclasss object = new Subclasss();
		object.PrintMsg();
	}
}

