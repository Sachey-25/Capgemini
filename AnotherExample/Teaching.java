package AnotherExample;

public class Teaching {

	public static void main(String[] args) {
		//Create object
		//Reference to the class itself
		//print the same.
		Training object = new Training();
		object.info();
		System.out.println(object.getFname());
		System.out.println(object.getLname());
		System.out.println(object.getCity());
	}
}