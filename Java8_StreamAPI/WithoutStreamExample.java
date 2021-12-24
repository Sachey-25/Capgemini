package Java8_StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreamExample {
	public static void main(String[] args) {
		//Creating a list
		List<String> colors = new ArrayList<>();
		colors.add("Green");
		colors.add("Red");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Ceramic");
		//Loop, //Syso
		int count=0;
		/*for(String str : colors) {
			if(str.length()<6)
				count++;
		}*/
		System.out.println("There are " + count +" Strings with less than 6" );
		//**Implementing Stream API
		//variable, stream we must use lambda <--- best practice
		long countT = colors.stream().filter(temp -> temp.length()<6).count();
		System.out.println("There are " + countT +" Strings with less than 6" );	
	}
	}