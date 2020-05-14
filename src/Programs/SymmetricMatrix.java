package Programs;

import java.util.Scanner;

public class SymmetricMatrix {
	public static void main(String[] args) {
		int row, col;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row value");
		row = sc.nextInt();
		System.out.println("enter the col value");
		col = sc.nextInt();
		int a[][] = new int[row][col];
		System.out.println("enter the array value");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("array value is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		if (row != col) {
			System.out.println("The given matrix is not a square matrix, so it can't be symmetric.");
		} else {
			boolean symmetric = true;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (a[i][j] != a[j][i]) {
						 symmetric = false;
					}
				}
			}
			if(symmetric)
			{
				System.out.println("its symmetric matrix");
			}
			else
			{
				System.out.println("its not symmetric matrix");
			}
		}
	}
}
