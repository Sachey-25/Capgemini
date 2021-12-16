package DynamicDispatch;

public class SubclassDemoDEF extends SuperABCclass{
	public void myMethod() {
		//super keyword is used here to call parent class.
		super.myMethod();
		System.out.println("Overriding Method - SubClass");
	}

	public static void main(String[] args) {
		SubclassDemoDEF obj=new SubclassDemoDEF();
		obj.myMethod();

	}
}
