package Java8_StreamFilterAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollectMethod {

	public static void main(String[] args) {
		//We create a stream and apply a filter in a one line and 
		// the collect() to collect final stream and converts into a list
		
		//Creating a list 
		List<String> names = Arrays.asList("Daffodils","SunFlower","Lily","Tulips","Jasmine");
		//If any string > 4 collect them into a list
		
		List<String> longnames = names.stream() //Converting the list to stream
				.filter(str -> str.length() > 4) // Filter the stream to create a new stream
				.collect(Collectors.toList()); //Collect the final stream and convert into List
		//Displaying the long names of flowers
		longnames.forEach(System.out::println);
	}
}
