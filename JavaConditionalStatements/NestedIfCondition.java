package JavaConditionalStatements;

public class NestedIfCondition {
	public static void main(String[] args) {
		// program to find the largest number among three number using nested if statement
		int num=10, numb=20,number=30;
		//checking the condition for num
		if(num >= numb) {
			//nested if implementation
			if(num >= number) {
				/*This will execute only the former if statement is true */
				System.out.println(num + ": is the largest out of numb and number");
			}
			else
				System.out.println(number +":  Is the largest then number one");
		}
		else
			if(numb >= number) {
				/*This will execute if the condition in outer is false*/
				System.out.println(numb + ": is the largest then num and number");
			}else
				System.out.println(number +": is the largest then num and numb");
	}
}
