package Java8_StreamFilterAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class stream_one{
	public static void disp() {
		Stream<String> stream = Stream.of("JAVA","python","csharp","REACT");
		stream.filter(str -> str.endsWith("p")).forEach(System.out::println);
		}
}
class stream_two{
	public static void displ() {
		Stream<String> stream = Stream.of("JAVA","python","csharp","REACT");
		stream.filter(str -> str.endsWith("A")).forEach(System.out::println);
		}
	
}
class stream_three{
	public static void displa() {
		Stream<String> stream = Stream.of("JAVA","python","csharp","REACT");
		stream.filter(str -> str.endsWith("T")).forEach(System.out::println);
		}
}

public class StreamFilterMethod {
	public static void main(String[] args) {
		//Creating a list of Integer
		List<Integer> list = Arrays.asList(3,4,5,6,15,12,14);
		//Using the stream filter (Predicate predicate)
		//to get a stream consisting of the elements
		// that are divisible by 5. <-- Lambda Expression
		list.stream().filter(num -> num%5 == 0).forEach(System.out::println);
		System.out.println("The numbers that are divisible by 5 in the given list are:");
		
		//Creating a list of Strings
		stream_one res = new stream_one();
		res.disp();
		stream_two resu = new stream_two();
		resu.displ();
		stream_three resul = new stream_three();
		resul.displa();
		
		
		//Using a stream consisting of strings that are UpperCase.
		//stream.filter(str -> str.isUpperCase(str.charAt(1))).forEach(System.out::println);
		
		
	}
}
