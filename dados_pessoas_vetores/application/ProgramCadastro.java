package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class ProgramCadastro {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão cadastradas? ");
		int n = sc.nextInt();

		Pessoas[] vetor = new Pessoas[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Altura da %d° pessoa: ", i + 1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %d° pessoa: ", i + 1);
			char genero = sc.next().charAt(0);
			vetor[i] = new Pessoas(altura, genero);
		}

		Pessoas menor = Pessoas.menorAltura(vetor);
		Pessoas maior = Pessoas.maiorAltura(vetor);
		double mediaFeminino = Pessoas.mediaAlturaFeminino(vetor);
		double contagemMasculino = Pessoas.contagemMasculino(vetor);

		System.out.printf("\nMenor Altura = %.2f", menor.getAltura());
		System.out.printf("\nMaior Altura = %.2f", maior.getAltura());

		if (mediaFeminino == 0) {
			System.out.println("\nNão há mulheres cadastradas");
		} else {
			System.out.printf("\nMédia das alturas das mulheres = %.2f", mediaFeminino);
		}
		System.out.printf("\nNúmero de homens: %.0f", contagemMasculino);

		sc.close();

	}

}
