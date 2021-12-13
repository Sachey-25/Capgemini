package ArraysInJava;

import java.util.Arrays;

public class CopyAnArrayOnetoAnother {

	public static void main(String[] args) {
		// Copying the arrays
		int[] numbers= {1,2,3,4,5,6};
		int[] number= numbers; //Elements of an array are copied....!!!!
		for(int check:number) {
			System.out.println(check);
		}		
		//Can I change the first element to some other value now?
				//Yes I change
				number[0]=12;
				number[1]=24;
				number[2]=10;
				number[3]=20;
				number[4]=15;			
		for(int result:number) {
			System.out.println(result);
		}		
		
		//int[] source={1,2,3,4,5,6}
		//int[] destination=new int[6]  ====> ????????? YES!
		// Mechanism is called array construct
		int[] source={1,2,3,4,5,6};
		int[] destination=new int[6];
		
		//iterate and copy from source to destination
		for(int i=0; i<source.length;i++) {
			destination[i]=source[i];
		}
		//Method so as to convert array to string.
		System.out.println(Arrays.toString(destination));
		System.out.println("*******************************************************");
		//arraycopy(Object src, int objectDestion , int destPos, int length)

		int[] value= {2,3,4,55,67,88,99,100};
		int[] copy_value=new int[8];
		//creating destination array of having length of value
		int[] dest=new int[value.length];
		
		//Copying entire value array to dest
		System.arraycopy(value, 0, dest, 0, value.length);
		System.out.println("dest = "+Arrays.toString(dest));
		
		//copying elements from index2 on value array
		//Copying elements to index1 of dest array
		System.arraycopy(value, 2, copy_value, 1, 2);
		System.out.println("copy_value =" +Arrays.toString(copy_value));	
		System.out.println("*******************************************************");
		//copyOfRange()
		int[] source_one= {2,3,4,5,6,6,7,7};
		//copying entire source_one array to destination
		int[] destination_one=Arrays.copyOfRange(source_one, 0, source_one.length);
		System.out.println("Destination_one array hold the elements of source_one"
		+ Arrays.toString(destination_one));
		
	}
}