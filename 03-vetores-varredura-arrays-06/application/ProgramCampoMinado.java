package application;

import java.util.Scanner;

import entities.CampoMinado;

public class ProgramCampoMinado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			int tabuleiro = sc.nextInt();
			if (tabuleiro <= 0) {
				throw new IllegalArgumentException("O tamnho da array não pode ser menor que zero.");
			}

			int[] vet = new int[tabuleiro];

			for (int i = 0; i < vet.length; i++) {
				vet[i] = sc.nextInt();
			}

			CampoMinado camposDeMinas = new CampoMinado(vet);

			int[] minas = camposDeMinas.totalDeMinas();

			for (int m : minas) {
				System.out.println(m);
			}
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
