package Collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	private String studentName;
	private int rollNo;
	private int studnentAge;
	
	public Student(String studentName, int rollNo, int studnentAge) {
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.studnentAge = studnentAge;
	}	
	//We need to create a method explicitly to accomplish the sort mechanism
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + 
				", rollNo=" + rollNo + ", studnentAge=" + 
				studnentAge + "]";
	}	
	public int compareTo(Student comparestu) {
			int compareage=((Student)comparestu).getStudnentAge(); //Sort --> lowest to highest
			return this.studnentAge-compareage; //Student age lesser that element to should be first
		}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getStudnentAge() {
		return studnentAge;
	}
	public void setStudnentAge(int studnentAge) {
		this.studnentAge = studnentAge;
	}
}
public class SortwithComparable {
	public static void main(String[] args) {
		ArrayList<Student> Array = new ArrayList<Student>();
		Array.add(new Student("Sachin",223,28));
		Array.add(new Student("Java",224,19));
		Array.add(new Student("JavaAnother",224,19));
		Array.add(new Student("Programming",225,26));
		Array.add(new Student("With",226,25));
		Array.add(new Student("ArraySorting",227,24));
		Collections.sort(Array);
		for(Student str:Array) {
			System.out.println(str);  // 24, 25,26,27,28<====
		}
		}
}
