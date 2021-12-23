package Java8;

@FunctionalInterface
interface lamb{
	public int single(int a);
}

interface Name{
	//Function without parameter
	public String SayHello();
}

public class LambdaExmple_one {	
	public static void main(String[] args) {
		lamb object= (Sachin) -> Sachin+5;
		System.out.println(object.single(10));
		
		//Second interface
		Name msg =() ->{
			return "Hello Guys! Confused..!!!";
		};
		System.out.println(msg.SayHello());
	}
}