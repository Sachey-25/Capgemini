package AnotherExample;


//Subclass of Teaching
public class Training extends Teaching {
	 private String fname="Sachin";
	 private String lname="A";
	 private String city="Bangalore";
	
	protected String getFname() {
		return fname;
	}
	protected void setFname(String fname) {
		this.fname = fname;
	}
	protected String getLname() {
		return lname;
	}
	protected void setLname(String lname) {
		this.lname = lname;
	}
	protected String getCity() {
		return city;
	}
	protected void setCity(String city) {
		this.city = city;
	}
	public static void info() {
		System.out.println("This is subclass method...!!!");
	}
}
