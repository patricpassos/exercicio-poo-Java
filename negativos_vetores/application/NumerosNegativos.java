package application;

import java.util.Scanner;

import entities.Negativo;

public class NumerosNegativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		Negativo[] vetor = new Negativo[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			int numero = sc.nextInt();
			vetor[i] = new Negativo(numero);
		}

		System.out.println("NÚMEROS NEGATIVOS: ");
		Negativo.numerosNegativos(vetor);

		sc.close();

	}

}
