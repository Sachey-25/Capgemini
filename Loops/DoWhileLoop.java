package Loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		//Display the numbers from 1 to 5.
		
		int i=1, n=5;
		//I will make use of do while loop
	/*	do {
			System.out.println(i);
//			System.out.println(i);
//			System.out.println(i);
//			System.out.println(i);
//			System.out.println(i);
//			System.out.println(i);
			i++; //Updating the counter ----- 1,2,3,4,5
			if(i<0)
				break;
			else if (i==4)
				continue;
			
		}while(i<=n);//until and unless while loop goes false iteration will be continued.*/
		while(i<=n) {
			if(i==4)
				continue;
			i++;
		}
		System.out.println(i);
		System.out.println("While block is True.....!!!!");
	}
}