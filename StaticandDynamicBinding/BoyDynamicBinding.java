package StaticandDynamicBinding;

public class BoyDynamicBinding extends HumanDynamicBinding {
	
	//Overriding Method
	//Override method
		public void walk() {
			System.out.println("This is dynamic binding");
			System.out.println("its a method override --- Child class");
			System.out.println("Boy is walking");
			System.out.println("**********************************************");
		}
	public static void main(String[] args) {
		// I need to reference it up by creating objects
		// Override method helps us to reference the parent to child easily
		HumanDynamicBinding object = new BoyDynamicBinding();
		System.out.println("Human referencing to Boy(Child Class)");
		object.walk();
		
		//Override method helps us to reference the parent to parent easily
		System.out.println("Human referencing to Human");
		HumanDynamicBinding Obj = new HumanDynamicBinding();
		//HumanDynamicBinding Obj=(HumanDynamicBinding) object;
		Obj.walk();
	}
}
