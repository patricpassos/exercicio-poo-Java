package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cobaia;
import services.Analise;

public class ProgramCadastroCobaias {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Analise lista = new Analise();
		
		System.out.print("Quantos casos de teste serão digitados: ");
		int quantidadeTeste = sc.nextInt();
		
		for(int i = 0; i < quantidadeTeste; i++) {
			
			System.out.printf("\nCadastro %d° teste\n", i + 1);
			System.out.print("Quantidade de cobaias: ");
			Integer quantidade = sc.nextInt();
			
			System.out.println("Tipos de Cobaias:\n C - Coelho\n R - Rato\n S - Sapo");
			System.out.print("Tipo de cobaia (C-R-S): ");
			Character animal = sc.next().toUpperCase().charAt(0);
			
			while(animal != 'C' && animal != 'R' && animal != 'S') {
				System.out.println("\n**Digite o novamente o tipo de animal**");
				System.out.println("Tipos de Cobaias:\n C - Coelho\n R - Rato\n S - Sapo");
				System.out.print("Tipo de cobaia (C-R-S): ");
				animal = sc.next().toUpperCase().charAt(0);
			}
			
			Cobaia c = new Cobaia(quantidade, animal);
			lista.addLista(c);
		}
		
		System.out.println(lista);
		
		sc.close();

	}

}
