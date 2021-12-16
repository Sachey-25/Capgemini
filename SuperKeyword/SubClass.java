package SuperKeyword;

class SubClass extends Super_Class {
	int num=110;
	
	void printNumber() {
		System.out.println(super.num);  //Parent class as Super class <-- Super
	}
	public static void main(String[] args) {
		SubClass object = new SubClass();
		object.printNumber();
	}
}
