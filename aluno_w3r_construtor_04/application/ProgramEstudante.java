package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class ProgramEstudante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		char presenca;
		int id, frequencia;
		double nota;

		Estudante estudante;

		System.out.print("Id: ");
		id = sc.nextInt();
		System.out.print("Nome: ");
		sc.nextLine();
		nome = sc.nextLine();

		estudante = new Estudante(id, nome);

		int sequencia = 0;
		while (sequencia <= 3) {
			sequencia++;

			System.out.printf("Digite a %d° nota: ", sequencia);
			nota = sc.nextDouble();

			estudante.somaNotas(nota);
		}

		frequencia = 0;
		while (frequencia <= 4) {
			frequencia++;
			
			System.out.printf("Frequência %d: (s/n): ", frequencia);
			presenca = sc.next().charAt(0);
			
			estudante.presencaEscolar(presenca);
		}

		System.out.println("\nId: " + estudante.getId());
		System.out.print("\nAluno: " + estudante.getNome());
		System.out.print("\nFrequência: " + estudante.frequencia());
		System.out.printf("\nMédia: %.2f", estudante.media());
		System.out.println("\nStatus: " + estudante.status());

		sc.close();

	}

}
