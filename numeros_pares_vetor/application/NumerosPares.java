package application;

import java.util.Scanner;

import entities.Pares;

public class NumerosPares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();

		Pares vetor = new Pares(n);

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			int elemento = sc.nextInt();
			vetor.addElementos(i, elemento);
		}

		System.out.println("\nNÚMEROS PARES:");
		System.out.print(vetor + " ");

		sc.close();

	}

}
