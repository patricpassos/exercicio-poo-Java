package application;

import java.util.Scanner;

import entities.Line;

public class EachLine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("What is the order of the matrix? ");
		int order = sc.nextInt();

		Line matrix = new Line(order);

		for (int i = 0; i < matrix.getOrder(); i++) {
			for (int j = 0; j < matrix.getOrder(); j++) {
				System.out.printf("Element [%d %d]: ", i, j);
				int element = sc.nextInt();
				matrix.setElement(i, j, element);
			}
		}

		System.out.println("\nLARGEST ELEMENT IN EACH LINE:");
		int[] major = matrix.majorElement();
		for (int vet : major) {
			System.out.println(vet);
		}

		System.out.println("\nMAIN DIAGONAL:");
		int[] main = matrix.mainDiagonal();
		for (int mai : main) {
			System.out.println(mai);
		}

		System.out.println("\nSECONDARY DIAGONAL:");
		int[] secondary = matrix.secondaryDiagonal();
		for (int sec : secondary) {
			System.out.println(sec);
		}

		sc.close();

	}

}
