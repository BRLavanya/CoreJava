package Programs;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String str = "Lavanya";
		String str1 = "aynavaL";
		char c[] = str.toLowerCase().toCharArray();
		char c1[] = str1.toLowerCase().toCharArray();
		if (str1.length() == str.length()) {
			System.out.println("length matches");
			Arrays.sort(c);
			Arrays.sort(c1);
			boolean status = Arrays.equals(c, c1);
			if (status == true) {
				System.out.println("matches");
			} else {
				System.out.println("not a match");
			}
		} else {
			System.out.println("lenght does not match");
		}
	}
}
