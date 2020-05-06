package ControlStatements;

public class NestedIf {
	public static void main(String[] args) {
		int age = 20;
		int weight = 85;
		if (age > 18) {
			if (weight < 75) {
				System.out.println("can donate blood");
			} else {
				System.out.println("can not donate blood because of over weight");
			}
		} else {
			System.out.println("under age");
		}
	}
}
