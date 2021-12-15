package Inheritance;

//Base class ---> Parent class ----> data from parent class will be used in child class
class Vehicle {
	String brand ="Ford"; //Parent data
	//method ---> Behavior ----> Car
	public void engine() {
		System.out.println("Ford have smooth engine");
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Car myCar = new Car(); //Child Class  <======== I am use the data of child class 
		myCar.engine();
		System.out.println(myCar.brand+ " " +myCar.modelName);
	}
}
//Derived class ==> child class ---> subclass
class Car extends Vehicle{
	String modelName="EcoSport";  //child data
}