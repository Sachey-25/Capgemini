package Two_2D_arrays;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		
		int[][][] test= {
				{
					{1,2,3},
					{3,4,5},
					{6,7,8}
				},
				{
					{1,2,3},
					{3,4,5},
					{6,7,8}
				}
		};
		
		//In order to access the array elements <== we use for loop
		// Since it is a 3D array <=== 3 loops
		//for each <=== A=B=C
		for(int[][] array2D:test) {
			for(int[] array1D:array2D) {
				for(int i:array1D) {
					System.out.println(i);
				}
			}
		}
		//Advance for(int i; i<n ; i++)
		System.out.println("=======Advance Looping and finding the elements=========");
		for(int i=0;i<test.length;++i) {
			for(int j=0;j<test[i].length;j++) {
				for(int k=0;k<test[i][j].length;k++) {
					System.out.println(test[i][j][k]);
				}
			}
		}

	}//Closing bracket for java main function
}//Closing bracket for Java Class