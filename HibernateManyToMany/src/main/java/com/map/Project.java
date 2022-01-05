package com.map;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pid;
	@Column(name="Project_name")
	private String projectName;
	//Many concept (MANY  --- List)
	@ManyToMany(mappedBy = "projects")
	private List <emp> emp;
	
	//Generated getter and setter methods
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<emp> getEmp() {
		return emp;
	}
	public void setEmp(List<emp> emp) {
		this.emp = emp;
	}
	//Constructor
	public Project(int pid, String projectName, List<com.map.emp> emp) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.emp = emp;
	}
	//Default Constructor
	public Project() {
		super();
	}
}