package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Operations;

public class GeneralMatrix {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int order = 0;
		Operations matrix = null;
		
		while(matrix == null) {
			System.out.print("What is the order of the matrix? ");
			order = sc.nextInt();
			if(order <= 0) {
				System.out.println("ERROR: There is no order for negative or zero matrices.\n");
			} else {
				matrix = new Operations(order);
			}
		}
		
		for(int i = 0; i < matrix.getOrder(); i++) {
			for(int j = 0; j < matrix.getOrder(); j++) {
				System.out.printf("Element [%d %d]: ", i, j);
				double element = sc.nextDouble();
				matrix.setElement(i, j, element);
			}
		}
		
		double sumPositive = matrix.sumPositives();
		System.out.println("\nSUM POSITIVES: " + sumPositive);
		
		System.out.print("\nChosse a line: ");
		int row = sc.nextInt();
		System.out.print("SELECTED LINE: ");
		double[] lineMatrix = matrix.line(row);
		for(double l : lineMatrix) {
			System.out.print(l + " ");
		}
		
		System.out.print("\n\nChosse a column: ");
		int column = sc.nextInt();
		System.out.print("SELECTED COLUMN: ");
		double[] columnMatrix = matrix.column(column);
		for(double c : columnMatrix) {
			System.out.print(c + " ");
		}
		
		System.out.print("\n\nMAIN DIAGONAL: ");
		double[] main = matrix.mainDiagonal();
		for(double m : main) {
			System.out.print(m + " ");
		}
		
		System.out.print("\n\nMAIN SECONDARY: ");
		double[] secondary = matrix.secondaryDiagonal();
		for(double s : secondary) {
			System.out.print(s + " ");
		}
		
		System.out.println("\n\nMODIFIED MATRIX: ");
		double[][] modified = matrix.modified();
		for(int i = 0; i < matrix.getOrder(); i++) {
			for(int j = 0; j < matrix.getOrder(); j++) {
				System.out.print(modified[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
