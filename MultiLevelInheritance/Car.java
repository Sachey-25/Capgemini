package MultiLevelInheritance;

public class Car {
	//method of Class Car
	public Car() {
		System.out.println("Class Car");
	}
	//I would like to check what type of vehicle it is
	public void vehicalType() {
		System.out.println("Vehical Type is : Car" );
	}

	public static void main(String[] args) {
		// Creating an object to access the data from maruthi class 
		// Because class Car is the parent of class Maruthi.
		Maruti object = new Maruti();
		object.Maruthi();
		object.brand();
		object.speed();
		Vehicle car = new Vehicle();
		car.speed();
	}

}
