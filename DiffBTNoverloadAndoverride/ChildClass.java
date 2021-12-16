package DiffBTNoverloadAndoverride;

public class ChildClass extends Parent {
	
	//override method
	public int disp() {
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("This is child class method");
		System.out.println(c);
		return c;
		
	}

	public static void main(String[] args) {
		//object for the parent class
		Parent obj = new ChildClass();
		obj.disp();
	}

}
