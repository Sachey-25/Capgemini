package InterfacesInJava;
public interface MyInterface_ {
	//Interface method
	public static void info() {
		System.out.println("This is interface first method");
	}
	public static void inf() {
		System.out.println("This is interface second method");
	}
	public static void in() {
		System.out.println("This is interface third method");
	}
	
	//Inheritance applied on interface
	interface Interface extends MyInterface_{
		public static void info_again() {

		} //Inheritance method closed
	}//Inheritance is close here
	public class Demo implements Interface {
		/* Even though this class is only implementing the interface MyInterface,
		 * it has to implement all methods of MyInterface as well because Interface extends to 
		 * MyInterface.
		 */
		public void info() {
			
		}
		public void inf() {
			
		}
		public void in() {
			
		}
	}
	public static void Main(String args[]) {
		//We will create the object
		Demo obj = new Demo();
		inf();
		inf();
		in(); //Static interface we do not need to create object
		obj.info(); // An object created for the demo
	}
}