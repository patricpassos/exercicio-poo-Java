package application;

import java.util.Scanner;

import entities.Pares;

public class NumerosPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		
		Pares[] vetor = new Pares[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			int numero = sc.nextInt();
			vetor[i] = new Pares(numero);
		}
		
		
		System.out.println("\nNÚMEROS PARES:");
		Pares.numerosPares(vetor);
		int quantidadePares = Pares.quantidadePares(vetor);
		System.out.println("\n\nQUANTIDADE DE PARES = " + quantidadePares);
		
		sc.close();

	}

}
