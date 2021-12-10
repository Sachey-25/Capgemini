package Loops;

public class LoopPatterns {

	public static void main(String[] args) {
		/*     *
		 * 	   **
		 * 	   ***
		 * 	   ****
		 * 	   *****
		 * 	   ******
		 */
		for(int x=1;x<=6;x++) {
			//nested for : loop within a loop
			System.out.print("F");
			for(int y=1;y<=x; y++) {
				System.out.print("S");	
				for(int z=1;z<=y;z++) {
					System.out.print("*");
				}
			}
			System.out.println(); //Newline when the nested or inner loop is executed completely
		}

	}

}
