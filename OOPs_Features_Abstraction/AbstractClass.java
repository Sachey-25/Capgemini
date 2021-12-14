package OOPs_Features_Abstraction;

abstract class Alein{
	//Abstract method (does not have body)
	public abstract void animalSound();
	//Regular method
	public void sleep() {
		System.out.println("ZzzzZzzzz");
	} //trying to know the sound of an animal while sleeping
		//do we know which animal is that? ------> Sleeping<=== Animal
}
//Hide mechanism should be done in creating abstract subclass.......
class Man extends Alein{
	//Complete information will lay here
	//and this complete the hide mechanism
	public void animalSound() {
		System.out.println("A man says : Gurrr Gurrr");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Man object=new Man();
		object.animalSound();
		object.sleep();
		

	}

}
