package InterfacesInJava;
//Single interface implementation // Can I make multiple interfaces? If yes, How it is?
//I be able to implement them or not? Yes! It is possible
interface MultipleInterfaces {
	public static void even() {
		int a=20;
		if(a%2==0) {
			System.out.println(a + "Is even");
		}
	}
interface single{
	public static void odd() {
		int a=21;
		if(a%2==0) {
			System.out.println(a + "Is odd");
		}
	}
}
interface multi{
	public static void zero() {
		int a=0;
		if(a==0) {
			System.out.println(a + "Is Zero.!");
		}
	}
}
//Implementation is the process to call interface at one place.
	class demo implements MultipleInterfaces,single,multi{
		public void even() {
			int num=89;
			if(num%2==0)
			System.out.println("Method 1: This is priting even number");
			System.out.println(num);
		}
		public void odd() {
			System.out.println("Method 2: This is priting odd number");
		}
		public void zero() {
			System.out.println("Method 3: This is priting zero");
		}
	}
	public static void main(String[] args) {
		demo object = new demo();
		object.even();
		object.odd();
		object.zero();
		even();
	}
}