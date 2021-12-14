package JavaOOP.Constructors;

class Constructor{
	
	Constructor(){
		System.out.println("My first constructor...!!");
	}
}
	class ChildConstructor extends Constructor{
		ChildConstructor(){ //super()
			System.out.println("My child class constructor...!!");
		}
	}
public class ExtendConstructor {
	public static void main(String[] args) {
		
		//while creating an object 
		new ChildConstructor();
	}
}
