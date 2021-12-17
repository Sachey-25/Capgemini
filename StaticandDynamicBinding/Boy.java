package StaticandDynamicBinding;

public class Boy extends Human {
	
	//This a method reference from the parent class
			public static void walk() {
				System.out.println("Boy is walking...!");
			}
	public static void main(String[] args) {		
		/*This statement simply creates an object of class
		 * Boy and assigns a reference of body to it */
		Boy boyobject = new Boy(); //Object
		
		/*Since Boy extends Human class. The object creation can be done
		 * in this way, Parent class reference can have child class reference and assigned to it */
		Human object = new Boy(); // Reference //Referencing from parent to child
		
		/* Reference is of Human type and object is of human type */
		Human obj=new Human();
		boyobject.walk(); //Single Inheritance
	//This is not possible	object.walk(); //static ---> Override
		obj.walk();		
	}
}