package JavaOperators;

public class ComparisionOperator {

	public static void main(String[] args) {
	//Relational Operators
		//equal, greater, lesser, greaterthenequal, lessertheneqal, notqualto
		//==, > ,<, >=, <=, !=		
		int value=0;
		int count=1;		
		System.out.println(value == 0 && count == 1);//true
		System.out.println(value!=1 && count!= 0 || value==0 && count==1);//true
		System.out.println(value < count || count != 1 && value!=1 && count==1);//true
		System.out.println("***********************************************************");
		System.out.println(value==0); //true
		System.out.println(count==1); //true
		System.out.println(value!=0); //false
		System.out.println(count!=1); //false
		System.out.println(value<0); //false
		System.out.println(count<1); //false
		System.out.println(value<=0);//true
		System.out.println(count<=1);//true
		System.out.println(value>=0);//true 
		System.out.println(count>=1);//true
		
	}
}
