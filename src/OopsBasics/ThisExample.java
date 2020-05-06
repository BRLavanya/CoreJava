package OopsBasics;

public class ThisExample {
	int phoneNumber;
	String City;

	public ThisExample() {
		System.out.println("default constructor");
	}

	ThisExample(int phoneNumber, String City) {
		this();
		System.out.println("parametrized constructor");
		this.City = City;
		this.phoneNumber = phoneNumber;
	}

	public void m() {
		System.out.println("m method");
	}

	public void n() {
		this.m(); // similar to m();
		System.out.println("n method");
	}

	public static void main(String[] args) {
		ThisExample e = new ThisExample(100, "Bangalore");
		e.n();
	}
}
