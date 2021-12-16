package OOPMethods;
public class Boy extends Human{
	//Method for override
		public void eat() {
			System.out.println("Boy is eating");
		}
		public void study() {
			System.out.println("Boy is studying");
		}
		public void sleep() {
			System.out.println("Boy is sleeping");
		}
		public void printparent() {
			super.eat();
			super.study();
			super.sleep();
		}
	public static void main(String[] args) {
		Boy object = new Boy();
		object.eat();	//Child class method execution
		System.out.println("This is Executing from Parent class");
		object.printparent();
		object.study();
		System.out.println("This is Executing from Parent class");
		object.printparent();
		object.sleep();
		System.out.println("This is Executing from Parent class");
		object.printparent();
	}
}
