package InheritancePolymorphism;

class car {
	int manufacturingYear;
	String carCompanyName;

	car(int manufacturingYear, String carCompanyName) {
		this.manufacturingYear = manufacturingYear;
		this.carCompanyName = carCompanyName;
	}

	public void drive() {
		System.out.println("driving the car");
	}

	public void fuel() {
		System.out.println("you can only put diesel");
	}
}

class wagnor extends car {
	String licenseNumber;

	wagnor(int manufacturingYear, String carCompanyName, String licenseNumber) {
		super(manufacturingYear, carCompanyName);
		this.licenseNumber = licenseNumber;
	}

	public void featuresDetails() {
		System.out.println("car company name is " + carCompanyName);
		System.out.println("manufacturing year is " + manufacturingYear);
		System.out.println("license number is " + licenseNumber);
	}

}

public class SingleLevelInheritance {
	public static void main(String[] args) {
		wagnor w = new wagnor(2013, "maruthi", "KA03MJ4321");
		w.drive();
		w.fuel();
		w.featuresDetails();
	}
}
