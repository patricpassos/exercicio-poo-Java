package application;

import java.util.Scanner;

import entities.Matrices;

public class ProgramSumMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int row = 0, column = 0;
		Matrices matrix = null;

		while (matrix == null) {
			System.out.print("How many rows are in the matrix? ");
			row = sc.nextInt();
			System.out.print("How many columns are in the matrix? ");
			column = sc.nextInt();
			if (row <= 0 || column <= 0) {
				System.out.println("ERROR: There is no order for negative or zero matrices.\n");
			} else {
				matrix = new Matrices(row, column);
			}
		}

		System.out.println("Enter the values for matrix A:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("Element [%d %d]: ", i, j);
				int element = sc.nextInt();
				matrix.setMatrixA(i, j, element);
			}
		}

		System.out.println("Enter the values for matrix B:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("Element [%d %d]: ", i, j);
				int element = sc.nextInt();
				matrix.setMatrixB(i, j, element);
			}
		}

		matrix.sum(); // chamada para calacular a soma dos vetores
		matrix.subtraction();

		System.out.println("\nMATRIX SUM:");
		int[][] sum = matrix.sumMatrix();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nMATRIX SUBTRACTION");
		int[][] subtraction = matrix.subtractionMatrix();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(subtraction[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
