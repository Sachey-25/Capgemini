package HybridInheritance;

//Hierarchical + Single ==> Hybrid 
// A <---B  B<---C + C <---D


//B<----A
public class B extends A{
	
	public void dispB() {
		System.out.println("Method of B");
	}

}
//C <---B =====> A<---B  A<---C
class C extends A {
	public void dispC() {
		System.out.println("Method of C");
	}
}

//Lets go the single inheritance
//D <--- B
class D extends B{
	public void disp() {
		System.out.println("Method of D");
	}
}