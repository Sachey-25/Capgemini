package org.capgemini.tut.ProjectWIthMaven;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_details")
public class Employee {
	@Id
	private int empid;
	private String empName;
	private int empph;
	private int empdekNum;
	public Employee(int empid, String empName, int empph, int empdekNum) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empph = empph;
		this.empdekNum = empdekNum;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpph() {
		return empph;
	}
	public void setEmpph(int empph) {
		this.empph = empph;
	}
	public int getEmpdekNum() {
		return empdekNum;
	}
	public void setEmpdekNum(int empdekNum) {
		this.empdekNum = empdekNum;
	}
	
	@Override
	public String toString() {
		return this.empid+ " : " + this.empName + ":" + this.empph + " : "+this.empdekNum;
	}
}
	
