package InheritanceWithGetterandSetter;

public class JavaExample extends Teacher {
	String mainTopic ="Inheritance in Java";
	public static void main(String[] args) {
		//Create the object for subclass
		JavaExample object = new JavaExample();
		object.disp();
		System.out.println(object.getDestination());
		System.out.println(object.getName());
		System.out.println(object.mainTopic);
	}
}
