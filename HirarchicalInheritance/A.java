package HirarchicalInheritance;

public class A {
	//Hierarchical Inheritance
	//Lets consider class A, Class B, Class C, Class D
	// Class B and Class C and Class D going to extend Class A.
	//Class method
	public void MethodA() {
		System.out.println("Method of A");
	}

	public static void main(String[] args) {
		//Creating an object 
		B obj=new B();
		C obje=new C();
		D objec=new D();
		//All classes can access the method of class A
		obj.MethodA();
		obje.MethodA();
		objec.MethodA();
	}
}
