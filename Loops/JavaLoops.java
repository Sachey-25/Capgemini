package Loops;

public class JavaLoops {

	public static void main(String[] args) {
		
		//i=5 ====> for loop suppose execute/run 5 times ==> 0==5,1==5,2==5,3==5,4==5,5==5
		for(int i=0; i<=5; i++) {
			System.out.println("My name is Sachin" + ":" + i);
		}
		System.out.println("==============================================");
		//i<5 ===> for loop suppose to execute/run all the 5 times however 5<5 hold false 
		//hence its 5 times executes.
		for(int i=5; i<0; i--) { 
			System.out.println("My name is Sachin" + ":" + i);
		}
		for(int i=0; i<=10; i++) {
			System.out.print(i);
		}
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}	
	}
}
