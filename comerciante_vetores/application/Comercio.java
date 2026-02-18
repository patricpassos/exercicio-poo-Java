package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Lucro;

public class Comercio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Serão digitados dados de quantos produtos? ");
		int n = sc.nextInt();
		
		Lucro[] vetor = new Lucro[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Produto %d\n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço de compra: ");
			double precoCompra = sc.nextDouble();
			System.out.print("Preço de venda: ");
			double precoVenda = sc.nextDouble();
			vetor[i] = new Lucro(nome, precoCompra, precoVenda);
		}
		
		System.out.println("\nRELATÓRIO:");
		
		int conta = 0;
		int contb = 0;
		int contc = 0;
		for(Lucro c : vetor) {
			if(c.statusLucro10()) {
				conta++;
			} else if (c.statusLucro10_20()) {
				contb++;
			} else if (c.statusLucro20()){
				contc++;
			}
		}
		
		System.out.println("Lucro abaixo de 10%: " + conta);
		System.out.println("Lucro entre de 10% e 20%: " + contb);
		System.out.println("Lucro acima de 20%: " + contc);
		
		double totalCompra = Lucro.totalCompra(vetor);
		double totalVenda = Lucro.totalVenda(vetor);
		double totalLucro = Lucro.totalLucro(vetor);
		System.out.printf("Valor total de compra: %.2f\n", totalCompra);
		System.out.printf("Valor total de venda: %.2f\n", totalVenda);
		System.out.printf("Lucro Total: %.2f\n", totalLucro);
		
		sc.close();
		
	}

}
