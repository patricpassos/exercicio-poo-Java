package application;

import java.util.Scanner;

import util.Resultante;

public class ProgramVetoresSoma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		Resultante[] vetorA = new Resultante[n];
		Resultante[] vetorB = new Resultante[n];
		Resultante[] vetorC = new Resultante[n];

		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			int numero = sc.nextInt();
			vetorA[i] = new Resultante(numero);
		}

		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
			int numero = sc.nextInt();
			vetorB[i] = new Resultante(numero);
		}

		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i < vetorC.length; i++) {
			int soma = vetorA[i].getNumero() + vetorB[i].getNumero();
			vetorC[i] = new Resultante(soma);
			System.out.println(vetorC[i]);
		}

		sc.close();

	}

}
