package OopsBasics;

class staticExample {
	int rollNo;
	int age;
	static String collegeName = "VTU";

	public staticExample(int rollNo, int age) {
		this.rollNo = rollNo;
		this.age = age;
	}

	public void display() {
		System.out.println("rollNo is " + rollNo + "\n" + "age is " + age + "\n" + "college name is " + collegeName);
	}
}

public class StaticVariable {
	public static void main(String[] args) {
		staticExample st = new staticExample(10, 01), st1 = new staticExample(20, 02);
		st.display();
		st1.collegeName = "msrit";
		st1.display();
		st.display();
		st1.collegeName = "VTU";
		System.out.println("*********");
		st.display();
	}
}
