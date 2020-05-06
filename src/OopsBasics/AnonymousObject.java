package OopsBasics;

public class AnonymousObject {
	
	public void display(String name)
	{
		System.out.println("hello.. my name is "+name);
	}
	public static void main(String[] args) {
		new AnonymousObject().display("Joker");
	}

}
