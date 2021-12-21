package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class AdvancePractice {
	//Sorting of ArrayList<String>

	public static void main(String[] args) {
		//We created an array which are consisting of list of countries.
		ArrayList<Integer> ListOfCountries=new ArrayList<Integer>();
		ListOfCountries.add(10);
		ListOfCountries.add(9);
		ListOfCountries.add(12);
		ListOfCountries.add(8);
		
		/*Unsorted List*/
		System.out.println("Arrays before sorting..!!");
		for(Integer counter:ListOfCountries) {
			System.out.println(counter);
		}
		/*Sorted List */
		Collections.sort(ListOfCountries,Collections.reverseOrder());
		System.out.println("Arrays after sorting...!!");
		for(Integer counter:ListOfCountries) {
			System.out.println(counter);
		}	
		}
	}