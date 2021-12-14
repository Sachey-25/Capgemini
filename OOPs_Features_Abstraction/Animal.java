package OOPs_Features_Abstraction;
//Abstract Class <==== I wanted to know how a particular animal makes sound.
abstract class animal_one{
	//Abstract method
	public abstract void animalSound();
	//Regular method
	public void Sound() {
		System.out.println("Bow Bow");
		System.out.println("How's sound is that??????");
	}
}
//SubClass 
class dog extends animal_one {
	//method =====> subclass comes into picture, until and unless the 
	// is called/invoked we can't be able see what exactly there in the method.
	public void animalSound() {
		System.out.println("The dog barks: BOW BOW");
	}
}
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog obj=new dog();
		obj.Sound();
		obj.animalSound();
	}
}
