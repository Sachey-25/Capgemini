package SpacialJavaPractice;

enum day{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY;
}

public class JavaEnum {	
	day Day; //Enum Object	
	//Constructor
	public JavaEnum(day Day) {
		this.Day=Day;
	}
	//	Creating a method to check the condition
	public void dayIsLike() {
		switch(Day) {
		case MONDAY:
			System.out.println("Mondays are bad");
			break;
		case TUESDAY:
			System.out.println("Tuesdays are better");
			break;
		case FRIDAY:
			System.out.println("Fridays are fun");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("WEEKENDS ARE THE BEST");
			break;
		default:
			System.out.println("Midweek days are okie-okie...!");
		}
	}
	public static void main(String[] args) {
		String str = "SATURDAY";
		JavaEnum Jenum=new JavaEnum(day.valueOf(str));
		Jenum.dayIsLike();
	}
}