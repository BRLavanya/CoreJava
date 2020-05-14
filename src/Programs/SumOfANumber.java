package Programs;

public class SumOfANumber {
	public static void main(String[] args) {
		int number = 7456;
		int sum = 0;
		while (number != 0) {
			int rem = number % 10;
			int quo = number / 10;
			sum = sum + rem;
			number = quo;
		}
		System.out.println("sum of the number is " + sum);
	}
}
