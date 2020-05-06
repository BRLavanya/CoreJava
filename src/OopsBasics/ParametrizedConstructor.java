package OopsBasics;

public class ParametrizedConstructor {
	int age;
	String name;
	ParametrizedConstructor(int age, String name)
	{
		this.name=name;
		this.age=age;
		System.out.println(age+" "+name);
	}
	public static void main(String[] args) {
		ParametrizedConstructor p = new ParametrizedConstructor(15,"tom");
		ParametrizedConstructor d1 = new ParametrizedConstructor(35,"jerry");
	}
}
