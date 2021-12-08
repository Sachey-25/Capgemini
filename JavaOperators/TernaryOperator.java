package JavaOperators;

public class TernaryOperator {

	public static void main(String[] args) {
		int number_one,number_two, number_three;
		String name_change;
		number_one=25;
		String name ="Sachin";
		number_two=(number_one == 10)? 1000:2000; //expression is nothing but a condition.
		number_three=(number_two== 2000)? 30:40;
		name_change=(name == "sachin")? "My name is Sachin":"My name is something" ;
		System.out.println("number_two: " + number_two);
		System.out.println("number_two: " + number_three);
		System.out.println("Hey guys! Good morning..." + name_change);
		System.out.println("Programming is fun!!!!!!!");
		/*String namee="SACHIN";
		String name1="Sachin";
		String name2="sachin";*/
		System.out.println("This is Newton's third law...!!!");
	}
}
