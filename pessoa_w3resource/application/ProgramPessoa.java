package application;

import java.util.Scanner;

import entities.Pessoa;

public class ProgramPessoa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome da pessoa: ");
		String nome = sc.nextLine();
		System.out.print("Digite a idade: ");
		int idade = sc.nextInt();
		System.out.print("Digite o país: ");
		sc.nextLine();
		String pais = sc.nextLine();

		Pessoa pessoa = new Pessoa(nome, idade, pais);

		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("País: " + pessoa.getPais());
		pessoa.faixaEtaria(idade);

		sc.close();

	}

}
