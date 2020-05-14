package Programs;

import java.util.Scanner;

public class MatrixOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row;
		System.out.println("enter the row value");
		row = sc.nextInt();
		int col;
		System.out.println("enter the col value");
		col = sc.nextInt();
		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		int c[][] = new int[row][col];
		System.out.println("enter the first array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter the second array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("first array");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(" "+a[i][j]);
				}
				System.out.println(" ");
			}
		System.out.println("second array");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(" "+b[i][j]);
				}
				System.out.println(" ");
			}
			System.out.println("addition of the array");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			System.out.println("sum of both array is");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(" "+c[i][j]);
				}
				System.out.println(" ");
			}
	}
}

