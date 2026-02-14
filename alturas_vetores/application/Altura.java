package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;

public class Altura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão cadastradas? ");
		int n = sc.nextInt();
		
		Cadastro[] cadastro = new Cadastro[n];
		
		for(int i = 0; i < cadastro.length; i++) {
			System.out.printf("Dados da %d° pessoa: \n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			cadastro[i] = new Cadastro(nome, idade, altura);
		}
		
		double media = Cadastro.mediaAltura(cadastro);
		double menorDeDezesseis = Cadastro.menorDeDezesseis(cadastro);
		
		System.out.printf("\nAltura média: %.2f", media);
		System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n", menorDeDezesseis);
		Cadastro.nomes(cadastro);
		
		sc.close();
		
	}

}
