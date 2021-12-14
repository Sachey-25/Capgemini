package StaticClass;

public class StaticMethods {
	
	/*Static Methods can access class variables (static variables) without using objects(instance)
	Of the class, However non-static variables can only be accessed using objects.
	*/
	static int i =10;
	static String name="Java Programming";
	
	static int j =20;
	static String n="Python Programming";
	static int k =30;
	static String num="C# Programming";
	static int l =40;
	static String na="Kotlin Programming";
	static int m =50;
	static String nam="React Programming";
	static int number =60;
	static String name_o="Angular Programming";
	
	//This is static method
	public static void main(String[] args) {
		// call the values of static integer and string.		
		System.out.println("i:" + i);
		System.out.println("name:" + name);
		System.out.println("=============================");
		System.out.println("j:" + j);
		System.out.println("n:" + n);
		System.out.println("=============================");
		System.out.println("k:" + k);
		System.out.println("na:" + na);
		System.out.println("=============================");
		System.out.println("i:" + i);
		System.out.println("nam:" + nam);
		System.out.println("=============================");
		System.out.println("l:" + l);
		System.out.println("name:" + name);
		System.out.println("=============================");
		System.out.println("m:" + m);
		System.out.println("name_o:" + name_o);
	}
}