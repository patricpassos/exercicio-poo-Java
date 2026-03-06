package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutosEstoque;

public class ProgramMediaProdutos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de produtos para cadastro: ");
		int n = sc.nextInt();

		ProdutosEstoque[] vet = new ProdutosEstoque[n];

		for (int i = 0; i < vet.length; i++) {
			sc.nextLine();
			System.out.print("Nome do produto: ");
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			vet[i] = new ProdutosEstoque(nome, preco);
		}

		double soma = 0.0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i].getPreco();
		}

		double mediaPreco = soma / vet.length;

		System.out.printf("média dos precos = %.2f", mediaPreco);

		sc.close();

	}

}
