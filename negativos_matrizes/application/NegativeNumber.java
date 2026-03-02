package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Negatives;

public class NegativeNumber {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Integer rows = 0, columns = 0;
		Negatives matrix = null;

		while (matrix == null) {
			System.out.print("How many rows are in the matrix? ");
			rows = sc.nextInt();
			System.out.print("How many columns are in the matrix? ");
			columns = sc.nextInt();
			if (rows <= 0 || columns <= 0) {
				System.out.println("ERROR: There is no order for negative or zero matrices.\n");
			} else {
				matrix = new Negatives(rows, columns);
			}
		}

		for (int i = 0; i < matrix.getRows(); i++) {
			for (int j = 0; j < matrix.getColumns(); j++) {
				System.out.printf("Element [%d %d]: ", i, j);
				int element = sc.nextInt();
				matrix.setElement(i, j, element);
			}
		}

		int negativeQuantity = matrix.negativeQuantity();
		System.out.println("\nNUMBER OF NEGATIVES: " + negativeQuantity);

		System.out.println("\nNEGATIVE VALUES:");
		int[] negativeValues = matrix.negativeValues();
		for (int number : negativeValues) {
			System.out.println(number);
		}

		sc.close();

	}

}
