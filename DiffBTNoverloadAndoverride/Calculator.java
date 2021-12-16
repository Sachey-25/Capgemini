package DiffBTNoverloadAndoverride;

class Calculator
{
	//I need to create the methods
	int add(int num_o, int num_t) {
		return num_o+num_t;
	}
	int add(int num_o, int num_t,int num_th) {
		return num_o+num_t+num_th;
	}
	int add(int num_o, int num_t,int num_th,int num_fo) {
		return num_o+num_t+num_th+num_fo;
	}
	int add(int num_o, int num_t,int num_th,int num_fo,int num_fi) {
		return num_o+num_t+num_th+num_fo+num_fi;
	}
	int add(int num_o, int num_t,int num_th,int num_fo, int num_fi,int num_si) {
		return num_o+num_t+num_th+num_fo+num_fi+num_si;
	}
	

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println("Sum of two numbers : " + obj.add(20, 21));
		System.out.println("Sum of three numbers : "+obj.add(20, 21, 22));
		System.out.println("Sum of four numbers : "+obj.add(20, 21, 22, 23));
		System.out.println("Sum of five numbers : "+obj.add(20, 21, 22, 23, 24));
		System.out.println("Sum of six numbers : "+obj.add(20, 21, 22, 23, 24, 25));
	}
}
//Account creation ===> adduser(int n1, int2, int n3)
//Ticket reversvation

//=====> create accounts() #Capgemini account
// ====> for loop() //===> if one user, use the method only one
//=====> multiple users ===> increase the parameter and use the same method
//=====> 100 ===> 100 difference method with one argument 
//=====> 1 method with 100 argument

// Every time new  method jvm/jre has to execute again and again but with different set of methods
// Every time new  method jvm/jre has to execute again and again but for number of arguments



