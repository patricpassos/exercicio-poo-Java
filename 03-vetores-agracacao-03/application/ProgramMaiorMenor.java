package application;

import java.util.Scanner;

import entities.LargerSmaller;

public class ProgramMaiorMenor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			int n = sc.nextInt();
			int[] vet = new int[n];

			for (int i = 0; i < vet.length; i++) {
				vet[i] = sc.nextInt();
			}

			LargerSmaller numbers = new LargerSmaller(vet);

			System.out.println(numbers.findLargest());
			System.out.println(numbers.findSmallest());
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
