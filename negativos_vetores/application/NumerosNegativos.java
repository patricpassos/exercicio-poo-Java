package application;

import java.util.Scanner;

import entities.Negativo;

public class NumerosNegativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		Negativo vet = new Negativo(n);

		for (int i = 0; i < vet.getNumero(); i++) {
			System.out.print("Digite um número: ");
			int elemento = sc.nextInt();
			vet.addElementos(i, elemento);
		}

		int contNegativo = vet.contagemNegativos();
		System.out.println("\nCONTAGEM DE NEGATIVOS: " + contNegativo);

		System.out.println("\nNÚMEROS NEGATIVOS: ");
		int[] numeroNegativo = vet.numerosNegativos();
		for (int neg : numeroNegativo) {
			System.out.println(neg);
		}

		sc.close();

	}

}
