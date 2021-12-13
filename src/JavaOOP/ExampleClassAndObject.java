package JavaOOP;

class Car{
	//State or field;
	int gear=5;
	int accelatalor=140;
	//Behavior -- Method
	public void brake() {
		System.out.println("Working of braking....");
	}
	public void speed() {
		System.out.println("Driving speed...");
}
}
public class ExampleClassAndObject {

	public static void main(String[] args) {
		Car car_object=new Car();
		System.out.println(car_object.gear);
		car_object.brake();
		car_object.speed();
		
	}

}
