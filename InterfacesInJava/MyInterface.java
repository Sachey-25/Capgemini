package InterfacesInJava;
public interface MyInterface {	
	public static void name(){
		String a="20";
		System.out.println("My name is Interface");
		System.out.println("Hello to the world");
		System.out.println(a);		
	}
	public static void planet(){
		String a="20";
		System.out.println("My name is Interface");
		System.out.println("Hello to the world");
		System.out.println("I belong to JavaPlanet");		
	}
	class Demo implements MyInterface{
		/* This class must have to implement both the abstract methods
		 * else you will end up getting compilation error
		 */
		public void name() {
			System.out.println("Method1: Implementation of method name");
		}
		public void planet() {
			System.out.println("Method2: Implementation of method planet");
		}
	}
	public static void main(String[] args) {
		//Object <==== Responsible for anything that you do in the class
		//MyInterface object = new Demo(); //Agree <--- Parent ---> child
		name();
		planet();
		//Why the demo is giving me chance to create to object but why not an interface!!!!
		Demo object = new Demo();
		object.name(); //Why? ----> It is Abstraction
		object.planet(); //Why? ----> It is Abstraction
	}
}
