package JavaOperators;

public class AssignmentOperator {

	public static void main(String[] args) {
		// '=' ==> Right hand side value is assigned to left side variable.
		int Composite=100;
		// '+=, -= , *= , /= , %='
		System.out.println(" = resut is : " + Composite); //100
		Composite +=10; //===> Composite=Composite+10===> 100+10 = 110;
		System.out.println("This is after assignemnt += operator : " + Composite);
		Composite -= 20;
		int change;
		change=Composite;
		System.out.println("New value as a change : " + change);
		Composite *= Composite;//-----> Composite = Composite-Composite = 90-90=0
		System.out.println("This is another change: " + Composite);
		Composite /=10;
		System.out.println("Lets seee this : " + Composite);
	}

}
