package application;

import java.util.Scanner;

import entities.Cobaia;
import services.Analise;

public class ProgramCadastroCobaias {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Analise lista = new Analise();
		
		System.out.print("Quantos casos de teste serão digitados: ");
		int quantidadeTeste = sc.nextInt();
		
		for(int i = 0; i < quantidadeTeste; i++) {
			System.out.print("Quantidade de cobaias: ");
			Integer quantidade = sc.nextInt();
			System.out.println("Tipo de cobaia (C-R-S): ");
			Character animal = sc.next().toUpperCase().charAt(0);
			
			Cobaia c = new Cobaia(quantidade, animal);
			lista.addTeste(c);
		}
		
		sc.close();

	}

}
