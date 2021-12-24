package Java8_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIwithIteration {
	public static void main(String[] args) {		
		Stream.iterate(1,count->count+1)
		.filter(number -> number%2==0)
		.limit(10)
		.forEach(System.out::println);
		
		List<String> alphabets = Arrays.asList("A","B","C","D","R","S","T","U");
		List<String> vowels = Arrays.asList("A","E","I","O","U");
		
		//Creating an object for stream
		Stream<Object> opstream= Stream.concat(alphabets.stream(), vowels.stream());
		opstream.forEach(temp -> System.out.println(temp + " "));
	}
}