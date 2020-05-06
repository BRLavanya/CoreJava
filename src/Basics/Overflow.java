package Basics;

public class Overflow {
	public static void main(String[] args) {
		int i =130;
		byte a =(byte )i;
		System.out.println("overflow: data lost because when trying to assign to lower memory space");
		System.out.println(i);
		System.out.println(a);
	}
}
