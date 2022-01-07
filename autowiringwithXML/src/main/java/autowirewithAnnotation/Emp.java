package autowirewithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("object")
	private Address address;

	public Address getAddress() { //Street and City
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}