package org.springcore.constructorInjection;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	private List<String> list;
	//Constructor
	public Person(String n, int pId, Certi certi,List<String> list) {
		this.name=n;
		this.personId=pId;
		this.certi=certi;
		this.list=list;
	}
	
	@Override
	public String toString() {
		return this.name+ " : " + this.personId+ "{ "+this.certi.name+"}";
	}
}