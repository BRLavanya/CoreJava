package Programs;

public class Pyramid3 {
	public static void main(String[] args) {
		int count = 1;
		for (int i = 9; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= count; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
			count++;
		}
	}
}
