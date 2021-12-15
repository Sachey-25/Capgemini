package HybridInheritance;

public class A {
	
	public void overall() {
		System.out.println("This is method of Parent class A");
		System.out.println("This is an Example of hybrid Inheritance");
	}

	public static void main(String[] args) {
		// Create an object for single inherited class
		D obj = new D();
		
		obj.overall();
		obj.dispB();
		C ob = new C();
		ob.dispC();
		obj.disp();

	}

}
