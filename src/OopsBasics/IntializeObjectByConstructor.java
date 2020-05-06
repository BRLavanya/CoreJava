package OopsBasics;

class assign {
	Refernce r = new Refernce();

	assign(String name, int age) {
		r.name = name;
		r.age = age;
	}

	public void display() {
		System.out.println("name is : " + r.name);
		System.out.println("age is : " + r.age);
	}
}

public class IntializeObjectByConstructor {
	public static void main(String[] args) {

		assign a = new assign("professor", 42);
		a.display();
	}
}
