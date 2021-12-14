package JavaOOP.Constructors;

class Computer{	
	int i;
	private Computer(){
		i =5;
		System.out.println("This is No-ArgConstructor....");
		Computer object=new Computer();
		System.out.println(object.i);
	} // <YourName>,<Java_Core-OOP>,<City>,<State>;
}	
class publicConstructor{
	int stats;
	boolean lang; //false
	int number; // 0
	
	//Defining a constructor
	public publicConstructor() {
		stats=100;
		System.out.println("This is No-arg public Constructor");
	}	
	//Parameterized Constructor
	public publicConstructor(String language, int number) {
		//languages = language;
		System.out.println("Language is : "  + "  " + language +" "+ "Is easy");
		System.out.println("Entered number is" + number) ; // 10
	}
	//Default constructor
	
}
public class ConstuctorInJava {
	public static void main(String[] args) {
		//Creating an object		
		publicConstructor obj=new publicConstructor("Java_Programming",10);		
		System.out.println("Value of stats is : " + obj.stats);
		System.out.println("Default value");
		System.out.println("lang = "+ obj.lang);
		System.out.println("number = " + obj.number);
	}
}
