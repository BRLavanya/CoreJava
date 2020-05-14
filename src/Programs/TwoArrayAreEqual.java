package Programs;

public class TwoArrayAreEqual {
	public static void main(String[] args) {
		int a[] = { 1, 5, 6, 7 };
		int b[] = { 1, 5, 6, 6 };
		boolean value = true;
		if (a.length == b.length) {
			System.out.println("length matches");
			for (int i = 0; i < a.length; i++) {
				if (a[i] == b[i]) {
					value = true;
				} else {
					value = false;
				}
			}
		} else {
			System.out.println("not a matching length");
		}
		if (value == true) {
			System.out.println("array matches");
		} else {
			System.out.println("array does not matches");
		}
	}
}
