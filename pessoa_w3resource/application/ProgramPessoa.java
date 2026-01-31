package application;

import java.util.Scanner;

import entities.Pessoa;

public class ProgramPessoa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome da pessoa: ");
		String nome = sc.nextLine();
		System.out.print("Digite a idade da pessoa: ");
		int idade = sc.nextInt();
		

		Pessoa pessoa = new Pessoa(nome, idade);

		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Faixa etaria: " + pessoa.faixaEtaria());

		sc.close();

	}

}
