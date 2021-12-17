package InterfacesInJava;

public interface _MyInterface {
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
				if(true)
					System.out.println("This is IF block");
				System.out.println("and I am from demo class inherted from MyInterface");
			}
			public void inf() {
				int a=20;
				if(a%2==0)
					System.out.println(a + "Even Number");
				
			}
			public void in() {
				String name = "Sachin";
				if(name=="Sachin");
				System.out.println("My name is : " + name);				
			}
		}
	public static void main(String[] args) {
		//We will create the object
				Demo obj = new Demo();
				inf();
				inf();
				in(); //Static interface we do not need to create object
				obj.in(); // An object created for the demo

	}

}
