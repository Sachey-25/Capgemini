package Loops;

public class LabelInLoops {
	public static void main(String[] args) {
		//Labeling concept
		//If I wanted to differentiate anything, we can label 
		//Most probably it is suitable in loops and if statements
		
		first: //the for loop is labeled as first
		for(int i=1;i<5;i++) {
			second: //the for loop is labeled as second
			for(int j=1;j<3;j++) {
				System.out.println("i = " + i + ":j= " +j );
				if(i==2)
					break first; //the break statement break the first for loop
				}
		}
	}
}
/*Analyse the output
================
i=1; j=1  ==> i==2 ==> False condition , 1,1 
later j++
i=1; j=2 ===> i==2 ==> False condition, 1,2
later j++ 
====================> second for loop been false as j= 3<3
later i++
i=2; j=1 ==> i==2 ==> True ===> first loop broked and terminated!!!!!!

i=1,j=1
i=1,j=2
i=2,j=1*/

