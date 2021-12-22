package SpacialJavaPractice;

enum Color{
	RED,GREEN,CYAN
}

class colors{
	Color color;
	public colors(Color color) {
		this.color=color;
	}
	
	public void Test() {
		switch(color) {
		case RED:
			System.out.println("You have choose Red and its danger!");
			break;
		case GREEN:
			System.out.println("You have choose Green and its Safe!");
			break;
		case CYAN:
			System.out.println("You have choose Cyan and status unknown!");
			break;
		default:
			System.out.println("All colours are wonderful.!");
		}
	}
}

public class Colours {
	public static void main(String[] args) {
		//Object for the class
		String clr = "GREEN";
		colors object = new colors(Color.valueOf(clr));
		object.Test();

	}

}
