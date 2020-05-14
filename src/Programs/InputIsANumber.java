package Programs;

import java.util.Scanner;

public class InputIsANumber {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
		str = sc.next();
		boolean status = false;
		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int asci = (int) c[i];
			System.out.println("asci: " + asci);
			for (int j = 48; j <= 57; j++) {
				System.out.println("hello");
				if (j == asci) {
					System.out.println("hello1");
					status = true;
					System.out.println("status is" + status);
					continue;
				} else {
					status = false;
					break;
				}
			}
		}
		System.out.println("status"+status);
		if (status == true) {
			System.out.println("its a number");
		} else {
			System.out.println("it is not a number");
		}
	}
}
