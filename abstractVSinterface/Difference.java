package abstractVSinterface;
//Abstract classes
class Example{
	//method
	public void display(){
	System.out.println("Display1 method");
	}
}
abstract class Exampl{
	//Method
	abstract void display_2();

public abstract class Examp extends Exampl{ //Single inheritance
	//Method
	abstract void display_3(); //This is abstract method
	
	@Override
	void display_2() { //method overrides the abstract method3 and gets the result of method2
		
	}
public abstract class Exam extends Examp{
	//Method
	abstract void display_4();
}
}
}
interface interface1{
	public static void disp1() {
		
	}
}
interface interface2{
	public static void disp2() {
		
	}
}
interface interface3{
	public static void disp3() {
		
	}
}
class subclass implements interface1,interface2,interface3{
	
}






//Main class
public class Difference {
	public static void main(String[] args) {
		

	}

}
