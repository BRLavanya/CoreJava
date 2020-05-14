package Programs;

import java.util.Scanner;

public class FrequencyOfAllDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("enter the number");
		number = sc.nextInt();
		char[] c = String.valueOf(number).toCharArray();
		for (int i = 0; i < c.length; i++) {
			int count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
				}
			}
			System.out.println("the number " + c[i] + " is present " + count + " times");
		}
	}
}
