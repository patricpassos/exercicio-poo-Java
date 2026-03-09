package application;

import java.util.Scanner;

import util.Resultante;

public class ProgramVetoresSoma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		Resultante vetor = new Resultante(n);

		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < n; i++) {
			int elementoA = sc.nextInt();
			vetor.setElementoA(i, elementoA);
		}

		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < n; i++) {
			int elementoB = sc.nextInt();
			vetor.setElementoB(i, elementoB);
		}

		vetor.somaVetores();
		System.out.println("VETOR RESULTANTE");
		int[] resultante = vetor.somaResultante();
		for (int r : resultante) {
			System.out.println(r);
		}
		
		System.out.println(vetor);

		sc.close();

	}

}
