package OOPs_Features_Abstraction;
//Abstract class
abstract class bankProcess{
	//abstract methods
	public abstract void account();
	//Regular process of bank
	public void credit() {
		System.out.println("Money Creaditted.....!");
		System.out.println("But how???????");
		//====> If anybody sends you the money through bank personal to personal <=== Text 
		//====> Wht account, at wht time, who was it????????
		//===> I need to login Internet Banking
	}
}
//Subclass
class Accounts extends bankProcess{
	public void Imps() {
		System.out.println("Money creditted through IMPS");	
	}
	public void NEFT() {
		System.out.println("Money creditted through NEFT");
	}
	public void cash() {
		System.out.println("Money creditted through cash");
	}
	public void cheque() {
		System.out.println("Money creditted through cheque");
	}
	@Override
	public void account() {
		return ;
	}	
}
public class ATMProcess {

	public static void main(String[] args) {	
		Accounts object = new Accounts();
		object.credit();
		object.cash();
		object.cheque();
		object.NEFT();
		object.Imps();		
	}
}
