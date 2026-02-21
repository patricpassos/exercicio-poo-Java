package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Adicao;

public class SomaListas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Adicao> list = new ArrayList<>();
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			Double parcela = sc.nextDouble();
			list.add(new Adicao(parcela));
		}
		
		double soma = Adicao.soma(list);
		double media = Adicao.media(list);
		
		System.out.print("\nVALORES DA LISTA: ");
		Adicao.itensLista(list);
		
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MÉDIA = %.2f", media);
		
		sc.close();

	}

}
