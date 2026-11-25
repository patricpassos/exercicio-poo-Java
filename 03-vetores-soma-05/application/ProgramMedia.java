package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MediaVetores;

public class ProgramMedia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			int n = sc.nextInt();

			if (n <= 0) {
				throw new IllegalArgumentException("Array size must be greater than zero.");
			}

			int[] vet = new int[n];

			for (int i = 0; i < vet.length; i++) {
				vet[i] = sc.nextInt();
			}

			MediaVetores media = new MediaVetores(vet);
			media.resultado();

		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
