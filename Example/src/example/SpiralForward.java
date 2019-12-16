package example;

import java.util.Scanner;

public class SpiralForward {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row of the matrix");
		int row = sc.nextInt();
		System.out.println("Enter the column of the matrix");
		int column = sc.nextInt();
		int spiral[][] = new int[row][column];
		int result[][] = new int[row][column];
		System.out.println("enter the element of matrix");
		int start = 0, end = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				spiral[i][j] = sc.nextInt();
			}
		}
		////////////////////////////////////
		
		
		
		while (start < row && end < column) {

			for (int i = end; i < column; i++) {
               
				System.out.println(spiral[start][i]);
			}
			start++;

			for (int i = start; i < row; i++) {

				System.out.println(spiral[i][column - 1]);
			}
			column--;
		

		if (start < row) {

			for (int i = column - 1; i >= end; i--) {
              
				System.out.println(spiral[row - 1][i]);
			}
			row--;

		}

		if (end < column) {

			for (int i = row - 1; i >= start; i--) {

				System.out.println(spiral[i][end]);
			}
			end++;
		}
		}

	}

}
