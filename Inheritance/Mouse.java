package Inheritance;

public class Mouse {
	
	public static void leftclick() {
		System.out.println("This is Left Click");
	}
	public static void rightclick() {
		System.out.println("This is Right Click");		
	}
	public static void scrollUp() {
		System.out.println("Scolled up!");
	}
	public static void scrolldown() {
		System.out.println("Scolled down!");
	}
	public static void main(String[] args) {
		leftclick();
		rightclick();
		scrollUp();
		scrolldown();
	}
}
