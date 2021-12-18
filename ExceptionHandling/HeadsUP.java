package JustCheck;

public class HeadsUP {
	public static void main(String[] args) {
		
		//Exception Handling
		// try catch throw thows and finaly =as like if elseif else if else
		//I am trying to devide a number with 0 and wanted to capture the error.
		try {
		int num=10;
		int numb=20;
		int result = num+numb; //======>30
		int finalresult=result/0;//------>30/0
		System.out.println(finalresult);
		}
		catch(ArithmeticException error) {
			System.out.println("You should not devide a number by zero");
			System.out.println("Because it is not a good devident");
			System.out.println("SInce error in the try block and it has been handled");
			System.out.println("In catch block and aleays it will handled in catch block only");
		}		
	}
}
