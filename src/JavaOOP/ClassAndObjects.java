package JavaOOP;
class Lamp{
	//storing the value for light 
	boolean isOn;		
	//Method to turn on the light
	void turnOn() {
		isOn=true;
		System.out.println("Light on ? : " + isOn);
	}
	//Method to turn off the light
	void turnoff() {
		isOn=false;
		System.out.println("Light on ? : " + isOn);
	}
	void color() {
	String color="ornage";
	System.out.println("Color of the lamp is : " + color);
	}
}
public class ClassAndObjects {
	public static void main(String[] args) {
		//Creating an object for the lamp		
		Lamp led = new Lamp();
		//I would like to call the methods to make sure 
		// The lamp is turn on or turn off
		led.turnOn();
		led.turnoff();
		// We can create numerious amount of object can be created on same class
		Lamp ledhydrogen = new Lamp();
		Lamp ledh = new Lamp();
		Lamp ledhy = new Lamp();
		Lamp ledhyd = new Lamp();
		ledhydrogen.turnOn();
		ledh.color();
		ledh.turnOn();
		ledh.turnoff();
		System.out.print("++++++++++++++++++++++++++++++++++");
		ledhyd.color();
		ledhyd.turnOn();
		ledhyd.turnoff();
		System.out.print("++++++++++++++++++++++++++++++++++");
		ledhy.color();
		ledhy.turnOn();
		ledhy.turnoff();
	}
}
