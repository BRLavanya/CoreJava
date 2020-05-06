package OopsBasics;

public class DefaultConstructor {

	int age;
	String name;
	DefaultConstructor()
	{
		System.out.println(age+" "+name);
	}
	public static void main(String[] args) {
		DefaultConstructor d = new DefaultConstructor();
		DefaultConstructor d1 = new DefaultConstructor();
	}
}
