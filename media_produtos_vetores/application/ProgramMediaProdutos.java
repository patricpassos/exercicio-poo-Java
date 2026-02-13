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
			System.out.printf("Digite o nome do %d° produto: ", i + 1);
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Digite o preço do produto: ");
			double preco = sc.nextDouble();
			vet[i] = new ProdutosEstoque(nome, preco);
		}
		
		double media = ProdutosEstoque.mediaDePrecos(vet);
		System.out.printf("Media dos preços: %.2f", media);

		sc.close();

	}

}
