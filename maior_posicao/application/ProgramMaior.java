package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Maior;

public class ProgramMaior {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de números: ");
		int n = sc.nextInt();
		
		Maior[] vetor = new Maior[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			double numero = sc.nextDouble();
			vetor[i] = new Maior(numero);
		}
		
		double maiorValor = Maior.maiorValor(vetor);
		double posicao = Maior.posicaoVetor(vetor);
		System.out.printf("\nMAIOR VALOR = %.1f", maiorValor);
		System.out.printf("\nPOSICÃO DO MAIOR VALOR = %.0f", posicao);
		
		sc.close();

	}

}
