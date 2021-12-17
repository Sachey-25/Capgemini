package PolyMorphism;
//ParentClass
class Overload{
	
	void add(int a) {
		System.out.println("a: " + a);
	}
	void add(int a, int b) {
		System.out.println("a and b are : " + a +"," + b );
	}
}
class CompileTimePolyMorphism {
	public static void main(String[] args) {
		Overload object = new Overload();
		object.add(10);
		object.add(10,20);
		System.out.println("This is an example of compile time polymorphism");
}
}
//Note: If there is parent class override mechanism <------Runtime Polymorphism>
//-----> If there is parent class overload mechanism <------Compile time Polymorphism>