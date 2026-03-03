package application;

import java.util.Scanner;

import entities.Matrices;

public class ProgramSumMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many rows will each matrix have? ");
		int row = sc.nextInt();
		System.out.print("How many columns will each matrix have? ");
		int column = sc.nextInt();

		Matrices matrix = new Matrices(row, column);

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

		matrix.sum();

		System.out.println("\nMATRIX SUM:");
		int[][] sum = matrix.sumMatC();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
