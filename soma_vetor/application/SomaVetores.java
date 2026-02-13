package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Soma;

public class SomaVetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		Soma[] vetor = new Soma[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			double numero = sc.nextDouble();
			vetor[i] = new Soma(numero);
		}
		
		double soma = Soma.somaVetores(vetor);
		double media = Soma.mediaVetores(vetor);
		
		System.out.printf("VALORES = ");
		Soma.valores(vetor);
		System.out.printf("\nSoma = %.2f\n", soma);
		System.out.printf("Média = %.2f", media);
		
		sc.close();

	}

}
