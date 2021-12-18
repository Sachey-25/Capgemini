package JustCheck;

import java.io.IOException;

public class ThrowsExample {
	//IOException <======= Device : laptop //Checked Exception
	
	public void method() throws IOException {
		throw new ArithmeticException("Device Error..!");
	}
	//We need to create a reference 
	//We create another method to address an exception
	void meth() throws IOException{     //This exception class [exception based method class]
		 method();
	}
	void letscheck() {
		try {
			meth();  // If this is fine, execution takes place.....
		}catch(Exception e){
			System.out.println("Exception Handled...!!!!!");
		}
	}
	public static void main(String[] args) {
		ThrowsExample obj = new ThrowsExample();
		obj.letscheck();	
		System.out.println("Normal Flow....!!!");
	}

}
