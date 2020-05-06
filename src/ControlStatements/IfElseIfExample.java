package ControlStatements;

public class IfElseIfExample {
	public static void main(String[] args) {
		int marks = -65;

		if (marks < 35) {
			System.out.println("fail");
		} else if (marks >= 35 && marks < 65) {
			System.out.println("second class");
		} else if (marks >= 65 && marks < 90) {
			System.out.println("first class");
		} else if (marks >= 90 && marks <= 100) {
			System.out.println("distinction ");

		} else {
			System.out.println("invalid number");
		}
	}
}
