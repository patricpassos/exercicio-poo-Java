package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		Alunos[] vetor = new Alunos[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Nome Aluno: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Primeira nota: ");
			double notaA = sc.nextDouble();
			System.out.print("Segunda nota: ");
			double notaB = sc.nextDouble();
			vetor[i] = new Alunos(nome, notaA, notaB);
		}

		System.out.println("\nAlunos aprovados:");
		
		for(Alunos a : vetor) {
			if(a.aprovacao()) {
				System.out.println(a.getNome());
			}
		}

		sc.close();
	}

}
