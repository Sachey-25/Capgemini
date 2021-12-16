package DynamicDispatch;
public class Subcalss extends ABC {
	//overriding method
	public void disp() {
		System.out.println("disp() method of subclass");
	}
	public void newMethod() {
		System.out.println("newMethod() method of subclass");
	}
	public static void main(String[] args) {
		/* When parent class reference refer to the parent class object 
		 * then in this case overridden method is the method of parent class
		 * is called.
		 */
		ABC object = new ABC();
		object.disp();
		/* When parent class reference refers to the child class object
		 * then the overriding method(method child class) is called.
		 * this is called dynamic method dispatch and runtime polymorphism
		 */
		ABC obj=new Subcalss();
		obj.disp();

	}
}