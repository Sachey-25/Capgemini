package Java8_MethodReferences;
import java.util.ArrayList;
import java.util.Collections;
class Person{
	private String name;
	private Integer age;
	
	//Constructor
	Person(String name, int age){
		//This keyword refers to current instance/variable itself
		this.name=name;
		this.age=age;
	}
	//Getter and setter
	public Integer getAge() {return age;}
	public String getName() {return name;}
}
class Reference{
	public static int getPersonName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}
}
public class AnotherExampleofStaticMethodReference {
	public static void main(String[] args) {
		ArrayList<Person> personlist = new ArrayList<>();
		personlist.add(new Person("Sachin",10));
		//Method reference
		Collections.sort(personlist,Reference::getPersonName);		
		//Stream
		personlist.stream().map(a -> a.getName()).forEach(System.out::println);
	}
}