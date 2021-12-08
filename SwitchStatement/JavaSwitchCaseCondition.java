package SwitchStatement;

public class JavaSwitchCaseCondition {

	public static void main(String[] args) {
		int num=4;
		switch(num)//2 True state ====> all the cases of switch statement will be executing
		{
			case 1:
				System.out.println("Case 1");
				break;
			case 2:
				System.out.println("Case 2");
				break;
			case 3:
				System.out.println("Case 3");
				break;
			case 4:
				System.out.println("Case 4");
				break;
			default:
				System.out.println("Default");
				break;
		}
	}

}
