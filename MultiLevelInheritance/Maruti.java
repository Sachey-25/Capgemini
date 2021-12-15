package MultiLevelInheritance;

public class Maruti extends Car{
	//MultiLevel Inheritance 
	//A<------B<----C
	//A is the grand parent
	//B is the parent
	//C is the child
	
	/* class C inherits class B and class B inherits A which means B is a parent of class C
	 * and A is a parent of class B.
	 * A is Parent of B
	 * B is Parent of C
	 * Let's consider Car as A, Maruthi as B
	 */
	//Method for class Maruthi
	public void Maruthi() {
		System.out.println("Class Maruthi");
	}
	public void brand() {
		System.out.println("Brand: MaruthiSuzuki");
	}
	//Speed
	public void speed() {
		System.out.println("Max speed is: 140kmph");
	}
}
class Vehicle extends Maruti{
	
	//Method ----> Behavior
	public Vehicle(){
		System.out.println("Maruthi model : 800");
	}
	public void speed() {
		System.out.println("Max speed is : 80kmph");
	}
}





