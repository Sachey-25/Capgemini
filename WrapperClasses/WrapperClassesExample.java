package WrapperClasses;

public class WrapperClassesExample {

	public static void main(String[] args) {
	/*-------------------------------------------	
		|Primitive dataTypes       WrapperClass |
		-------------------------------------------
		|1. boolean				1. Boolean		|
		|2. char				2. Character 	|
		|3. byte				3. Byte			|
		|4. short				4. Short		|
		|5. int					5. Integer		|
		|6. long				6. Long			|
		|7. float				7. Float		|
		|8. double				8. Double		| 
		-------------------------------------------*/
		
		//Converting int premitive into wrapper Integer object
		int num=100;
		//Autoboxing
		Integer object = Integer.valueOf(num);
		System.out.println(num + " " + object);
		int numb=200;
		System.out.println(object + numb); //200
		//You can directly create wrapper class object
		Integer obj = new Integer(250);
		
		//I would like to convert into primitive data type
		//Unboxing
		int number=obj.intValue();
		System.out.println(number+ " " + obj);
	}
}
