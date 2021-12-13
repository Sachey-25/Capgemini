package Two_2D_arrays;

public class Implementationof_2D_array {

	public static void main(String[] args) {
		
		//one_dimentional_array
		int[] number= {10,20,20,30,40};
		//two_dimentional_arrays
		int[][] Nnumber= {{ 1,2,3,3,4,5,66}};
		
		//Create 2D array
		int[][] array= {
				{1,2,3},{4,5,6,7},{8}  // array[0]={1,2,3} , array[1]={4,5,6,7}, array[2]={8}
		};
		System.out.println("Length of row1 : "+ array[0].length);
		System.out.println("Length of row1 : "+ array[1].length);
		System.out.println("Length of row1 : "+ array[2].length);
		//I wanted to traverse all the elements initialized in the array...!!
		// if it is a 1D array ===> One loop
		//if it is a 2D array ===> Two loops
		
		for(int i=0;i<array.length;++i) {
			for(int j=0;j<array[i].length;++j) {
				//in order to print the elements of an array we need to look 
				//into the index places and for loop works on index places 
				//hence we need to say array[i][j].
				System.out.println(array[i][j]);
			}
		}
		System.out.println("=====This is from for each implementation======");
		for(int[] arr:array) {
			for(int arra:arr) {
				System.out.println(arra);
			}
		}
		//A=B=C ===> A=C
		//Multi dimensional arrays:================
		// anything is more then two dimensions we call them 3Dimentional array!!
		int[][][] test= {
				{
					{1,-2,3},
					{4,-5,2}
				},
				{
					{-4,55,-6,-8},
					{1},
					{2,3}
				}
	};
		}
	}

