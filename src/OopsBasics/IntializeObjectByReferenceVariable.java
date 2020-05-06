package OopsBasics;

class Refernce {
	String name;
	int age;
}

public class IntializeObjectByReferenceVariable {
	public static void main(String[] args) {
		Refernce r = new Refernce();
		r.name="Tokyo";
		r.age=45;
		System.out.println("name is : "+ r.name);
		System.out.println("age is : "+r.age);
	}
}
