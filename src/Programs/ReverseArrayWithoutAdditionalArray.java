package Programs;

import java.util.Arrays;

public class ReverseArrayWithoutAdditionalArray {
	public static void main(String[] args) {
		int a[] = { 12, 9, 21, 17, 33, 7,2 };
		int length = a.length;
		int temp;
		for (int i = 0; i < length/2; i++) {
			temp=a[i];
			a[i]=a[length-1-i];
			a[length-1-i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
