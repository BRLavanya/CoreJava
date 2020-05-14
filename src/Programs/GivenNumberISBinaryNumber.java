package Programs;

import java.util.Scanner;

public class GivenNumberISBinaryNumber {
	public static void main(String[] args) {
		int number;
		boolean status = false;
		;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		char c[] = String.valueOf(number).toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '0' || c[i] == '1') {
				status = true;
				continue;
			} else {
				status = false;
				break;
			}
		}
		if (status == true) {
			System.out.println("is a binary number");
		} else {
			System.out.println("is not binary number");
		}
	}
}
