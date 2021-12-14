package StaticClass;

public class StaticClass {
	/*Static class can be made using static keyword only
	if it is nested class 
	1. Nested static class doesn't need reference of Outer class
	2. A static class cannot access non-static members of the Outer class
	*/
	
	//Static class
	static String str="sachin";
			static class NestedClass{				
				//non-static method
				public void display() {
					System.out.println(str);
				}
			}
	public static void main(String[] args) {
		StaticClass.NestedClass object = new StaticClass.NestedClass();
		object.display();
		

	}

}
