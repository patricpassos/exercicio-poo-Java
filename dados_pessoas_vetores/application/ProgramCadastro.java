package application;

import java.util.Locale;
import java.util.Scanner;

import services.AnalisePessoas;

public class ProgramCadastro {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão cadastradas? ");
		int n = sc.nextInt();

		AnalisePessoas vetor = new AnalisePessoas(n);

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %d° pessoa: ", i + 1);
			double altura = sc.nextDouble();

			System.out.printf("Genero da %d° pessoa(M/F): ", i + 1);
			char genero = sc.next().toUpperCase().charAt(0);

			while (genero != 'M' && genero != 'F') {
				System.out.print("Entrada inválida! Digite Genero (M/F): ");
				genero = sc.next().toUpperCase().charAt(0);

			}

			vetor.setElementos(i, altura, genero);
		}

		System.out.println(vetor);

		sc.close();
	}

}
