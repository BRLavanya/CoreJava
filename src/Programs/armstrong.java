package Programs;

public class armstrong {
	public static void main(String[] args) {
		int number = 153;
		int temp=number;
		int length = String.valueOf(number).length();
		int sum = 0;
		while (number != 0) {
			int lastdigit = 1;
			int rem = number % 10;
			int quot = number / 10;
			System.out.println("quo " + quot);
			System.out.println("rem " + rem);
			for (int i = 1; i <= length; i++) {
				lastdigit *= rem;
			}
			sum = sum + lastdigit;
			System.out.println("sum is" + sum);
			number = quot;
		}
		if (sum == temp) {
			System.out.println("armstrong");
		} else {
			System.out.println("not a armstrong");
		}

	}
}
