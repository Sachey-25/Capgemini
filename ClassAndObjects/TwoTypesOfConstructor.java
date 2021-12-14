package ClassAndObjects;

public class TwoTypesOfConstructor {
	//fields ---> states ---> Data-types
	int carmodel;
	String carname;
	long carprize;
	String carcolor;
	String manufacture;
	
	//default constructor <=== Assigning the values then and there!
	TwoTypesOfConstructor(){
		this.carmodel=2021;
		this.carname="HyundaiCreta";
		this.carprize=1300000;
		this.carcolor="White";
		this.manufacture="Hyundai";
	}
	//Parameterized constructor <===== We need to create an object and pass the values..!
	public TwoTypesOfConstructor(int model, String name, long prize, String color, String manufac) {
		super();
		this.carmodel = model;
		this.carname =name;
		this.carprize = prize;
		this.carcolor = color;
		this.manufacture = manufac;
	}
	
	public static void main(String[] args) {
		// Constructors 1. Default Constructor 2. Parameterized constructors
		TwoTypesOfConstructor car=new TwoTypesOfConstructor();
		TwoTypesOfConstructor car_one=new TwoTypesOfConstructor(2021,"HyundaiCreta",1300000,"White","Hyundai");
		
		System.out.println("This is printing from default constructor" + "\n" +
				"CarModel"+":"+ car.carmodel + "\n " +
				"Carname"+ ":" +car.carname + "\n" +
		 		"Carprize" + ":" + car.carprize + "\n "+
				"CarColor"+ ":" +car.carcolor + "\n" +
				"carManufacturer"+car.manufacture);
		System.out.println("This is printing from parameterized constructor" + "\n" +
				"CarModel"+":"+ car_one.carmodel + "\n " +
				"Carname"+ ":" +car_one.carname + "\n" +
		 		"Carprize" + ":" + car_one.carprize + "\n "+
				"CarColor"+ ":" +car_one.carcolor + "\n" +
				"carManufacturer"+car_one.manufacture);
		}
	}
