package Programs;

public class PairsAndSums {
	public static void main(String[] args) {
		int arr[] = { 3, 7, 10, 0, 1 };
		int sum = 10;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int x = arr[i] + arr[j];
				if (x == sum) {
					System.out.println(arr[i] + "," + arr[j]);
					break;
				}
			}
		}
	}
}
