package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Media;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		Media[] vetor = new Media[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			double elemento = sc.nextDouble();
			vetor[i] = new Media(elemento);
		}
		
		double media = Media.mediaVetor(vetor);
		System.out.printf("\nMÉDIA DO VETOR = %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		Media.abaixoMedia(vetor);
		
		sc.close();

	}

}
