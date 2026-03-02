package application;

import java.util.Locale;
import java.util.Scanner;

import entities.SomaMatrizes;

public class SomaLinhas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int m = 0, n = 0;
		SomaMatrizes matriz = null;
		while(matriz == null) {
			System.out.print("Qual a quantidade de linhas da matriz? ");
			m = sc.nextInt();
			System.out.print("Qual a quantidade de colunas da matriz? ");
			n = sc.nextInt();
			if(m <= 0 || n <= 0) {
				System.out.println("ERRO: Não existe ordem de matrizes negativas ou nulas\n");
			} else {
				matriz = new SomaMatrizes(m, n);
			}
		}

		for (int i = 0; i < matriz.getLinha(); i++) {
			System.out.printf("Digite os elementos da %d° linha:\n", i + 1);
			for (int j = 0; j < matriz.getColuna(); j++) {
				double elemento = sc.nextDouble();
				matriz.setElementos(i, j, elemento);
			}
		}

		System.out.println("VETOR GERADO:");
		double[] somaLinha = matriz.somaLinha();
		for (double vetorSoma : somaLinha) {
			System.out.println(vetorSoma);
		}

		sc.close();
	}

}
