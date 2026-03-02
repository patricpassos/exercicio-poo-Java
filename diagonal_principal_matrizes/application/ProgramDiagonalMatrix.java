package application;

import java.util.Scanner;

import entities.Matriz;

public class ProgramDiagonalMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();

		Matriz matriz = new Matriz(n); // cria um ponteiro na stack que aponta que aponta para o heap (n)

		System.out.println("Digite os valores da matriz:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d %d]: ", i, j);
				int elemento = sc.nextInt();
				matriz.setValor(i, j, elemento); // ponte com as referencias de coluna e linha para inputs da matriz
			}
		}

		System.out.println("\nDiagonal principal:");
		int[] diagonal = matriz.getDiagonalPrincipal(); // ponteiro que aponta para o a "caixa" vetor do metodo
		for (int valor : diagonal) {
			System.out.print(valor + " ");
		}

		int negativos = matriz.contagemNegativos();
		System.out.println("\n\nQuantidade de valores negativos: " + negativos);

		sc.close();

	}

}
