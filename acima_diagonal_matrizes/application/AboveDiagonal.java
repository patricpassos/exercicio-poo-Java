package application;

import java.util.Scanner;

import entities.Above;

public class AboveDiagonal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int order = 0;
		Above matrix = null;
		
		while(matrix == null) {
			System.out.print("What is the order of the matrix? ");
			order = sc.nextInt();
			if(order <= 0) {
				System.out.println("ERROR: There is no order for negative or zero matrices.\n");
			} else {
				matrix = new Above(order);
			}
		}
		
		for(int i = 0; i < matrix.getOrder(); i++) {
			for(int j = 0; j < matrix.getOrder(); j++) {
				System.out.printf("Element [%d %d]: ", i, j);
				int element = sc.nextInt();
				matrix.setElement(i, j, element);
			}
		}
		
		int sumAbove = matrix.sumAboveDiagonal();
		System.out.println("SUM OF THE ELEMENTS ABOVE THE MAIN DIAGONAL = " + sumAbove);
		
		sc.close();

	}

}
