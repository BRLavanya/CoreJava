package Programs;

import java.util.Arrays;

public class SeprateZerosArray {
public static void main(String[] args) {
	int arr[]= {14, 0, 5, 2, 0, 3, 0};
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+", 	");
	}
}
}
