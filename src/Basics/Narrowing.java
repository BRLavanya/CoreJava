package Basics;

public class Narrowing {

	public static void main(String[] args) {

		float f = 10.56f;
		// int i=f; compile time error
		int i = (int) f;
		System.out.println("narrowing converting higer data  type to lower data type by casting");
		System.out.println(f);
		System.out.println(i);
	}

}
