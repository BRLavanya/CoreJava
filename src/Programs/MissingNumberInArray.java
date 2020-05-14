package Programs;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] a = { 1, 4, 5, 3, 7, 8, 6 };
		int length = a.length;
		int sum = 0, sum1 = 0;
		for (int i = 0; i < length; i++) {
			sum = sum + a[i];
		}
		int largest = a[0];
		for (int j = 1; j < length; j++) {
			if (largest < a[j]) {
				largest = a[j];
			}
		}
		for (int i = 1; i <= largest; i++) {
			sum1 += i;
		}
		System.out.println("missing number is " + (sum1 - sum));
	}
}
