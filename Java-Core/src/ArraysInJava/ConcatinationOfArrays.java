package ArraysInJava;

import java.util.Arrays;

public class ConcatinationOfArrays {

	public static void main(String[] args) {
		// Joining/combining arrays with one another.
		String[] name= {"Sachin","Programming"};
		String[] code= {"TechnicalTrainer","Java"};
		String[] status= {"Programming","is","fun"};
		
		//Array======>length of it...
		int nameLength=name.length;
		int codeLength=code.length;
		int statusLength=status.length;
		String[] result=new String[nameLength+codeLength+statusLength];
		
		System.arraycopy(name, 0, result, 0, name.length);
		System.arraycopy(code, 0, result,name.length, code.length);
		System.arraycopy(status, 0, result, name.length+code.length,status.length);
		System.out.println(Arrays.toString(result));
		
		System.out.println("*********************************************************");
		//Concatenating two arrays without using arraycopy
		int[] array_one= {1,2,4}; //3index
		int[] array_two= {3,5,6}; //3index
		
		//Array ====>Length
		int length=array_one.length+array_two.length;
		
		int res[]=new int[length];
		int pos=0;
		for(int element:array_one) {
			res[pos]=element;
			pos++;
		}
		for(int element:array_two) {
			res[pos]=element;
			pos++;
		}
		System.out.println(Arrays.toString(res));
	}
}
