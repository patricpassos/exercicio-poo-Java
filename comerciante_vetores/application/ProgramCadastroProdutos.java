package application;

import java.util.Locale;
import java.util.Scanner;

import services.Lucro;

public class ProgramCadastroProdutos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Serão digitados dados de quantos produtos? ");
		int n = sc.nextInt();

		Lucro vetor = new Lucro(n);

		for (int i = 0; i < n; i++) {
			System.out.printf("Produto %d\n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço de compra: ");
			double precoCompra = sc.nextDouble();
			System.out.print("Preço de venda: ");
			double precoVenda = sc.nextDouble();
			vetor.setProdutos(i, nome, precoCompra, precoVenda);
		}

		System.out.println(vetor);

		sc.close();

	}
}
