package OopsBasics;

class initialize {
	Refernce r = new Refernce();

	public void initalise(int age, String name) {
		r.name = name;
		r.age = age;
	}

	public void display() {
		System.out.println("name is : " + r.name);
		System.out.println("age is : " + r.age);
	}
}

public class IntializeObjectByMethod {
	public static void main(String[] args) {
		initialize i = new initialize();
		i.initalise(55, "Berlin");
		i.display();
	}

}
