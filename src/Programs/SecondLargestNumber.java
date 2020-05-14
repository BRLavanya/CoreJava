package Programs;

import java.util.Arrays;

public class SecondLargestNumber {
public static void main(String[] args) {
	int []a= {45,55,36,11};
	Arrays.sort(a);
	int length=a.length;
	System.out.println(a[length-2]);
}
}
