package Programs;

public class SecondLargestWithoutBuiltin {
	public static void main(String[] args) {
		int[] a = { 45, 55, 36, 11 };
		int largest;
		int secondLargest;
		if (a[0] > a[1]) {
			largest = a[0];
			secondLargest = a[1];
		} else {
			largest = a[1];
			secondLargest = a[0];
		}
		for (int i = 2; i < a.length; i++) {
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if (a[i] < largest && a[i] > secondLargest) {
				secondLargest = a[i];
			}
		}
		System.out.println(secondLargest);
	}
}
