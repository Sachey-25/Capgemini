package JustCheck;
public class FinallyExample {	
	void check() throws ArithmeticException{
		throw new ArithmeticException("Calculation Error..!!");
	}
	//reference: we can't use throws just like that
	void result() throws ArithmeticException{
		check();
	}
	void completeResult() {
		try {
			int num=121/0;
			System.out.println(num); //Arithmetic exception
			
		}catch(Exception e) {
			// catch will not -- does't matter either there's an exception or not exception
			System.out.println("Number should not be divided by zero...!");
			System.out.println("Exception Handled...!");
			throw new ArithmeticException("this will throw an error..!!!");
		}
		finally {
			/* Finally block will always executes even if there is no exception in try block*/
			System.out.println("Try block worked");
			System.out.println("Hence no worries..!");
	}
	}	
	public static void main(String[] args) {
		//finally always be in the combination of try, catch and finally
		//Also try catch throw finally.
		FinallyExample exception = new FinallyExample();
		exception.completeResult();
	}
}
