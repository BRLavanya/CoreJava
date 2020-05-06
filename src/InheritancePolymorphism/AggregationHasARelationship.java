package InheritancePolymorphism;

class address {
	String city, state, country;

	address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class employees {
	String name;
	int id;
	address address;

	public employees(String name, int id, address address) {
		this.name = name;
		this.id = id;
		this.address=address;
	}

	public void displayDetails() {
		System.out.println("employee name is " + name);
		System.out.println("employee id is " + id);
		System.out.println("employee address details are");
		System.out.println("employee city name is " + address.city);
		System.out.println("employee state name is " + address.state);
		System.out.println("employee country name is " + address.country);

	}
}

public class AggregationHasARelationship {
public static void main(String[] args) {
	address a1= new address("Bangalore", "Karnatake", "India");
	address a2= new address("London city", "London", "europe");
	employees e1= new employees("Joker", 1010, a1);
	employees e2= new employees("Robert", 100, a2);
	e1.displayDetails();
	System.out.println("*************************");
	e2.displayDetails();
}
}
