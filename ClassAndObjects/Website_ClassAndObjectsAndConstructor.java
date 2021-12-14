package ClassAndObjects;

public class Website_ClassAndObjectsAndConstructor {
	//States are also called as fields
		String webname;
		int webAge;
		//Constructor to initialize the values for states/fields
		public Website_ClassAndObjectsAndConstructor(String webname, int webAge) {
			super();
			this.webname = webname;
			this.webAge = webAge;
		}
	public static void main(String[] args) {
		// What is a class in OOPs, Objects and constructor in this program..!
		//Creating an objects
		Website_ClassAndObjectsAndConstructor obj=new Website_ClassAndObjectsAndConstructor("TechMasters", 5);
		Website_ClassAndObjectsAndConstructor obje=new Website_ClassAndObjectsAndConstructor("Wipro.com", 15);
		Website_ClassAndObjectsAndConstructor objec=new Website_ClassAndObjectsAndConstructor("Capgemini", 15);
		//Accessing the elements/object data of the class
		System.out.println("Current Webnameis : " + obj.webname);
		System.out.println("Current Webage is : " + obj.webAge);
		System.out.println("Current Webname is : " + obje.webname);
		System.out.println("Current Webage is : " + obje.webAge);
		System.out.println("Current Webname is : " + objec.webname);
		System.out.println("Current Webage is : " + objec.webAge);
	}
}
