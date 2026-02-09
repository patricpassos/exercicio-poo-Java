package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cachorro;

public class ProgramCachorro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome, cor;
		char resp;
		double peso;
		
		Cachorro cachorroA, cachorroB;
		
		System.out.print("Nome: ");
		nome = sc.next();
		System.out.print("Cor: ");
		cor = sc.next();
		System.out.print("Peso: ");
		peso = sc.nextDouble();
		
		cachorroA = new Cachorro(nome, cor, peso);
		
		do {
			System.out.print("O cachorro latiu (s/n)? ");
			resp = sc.next().charAt(0);
			
			if (resp == 's') {
				cachorroA.latir();			
			}
			
		} while (resp != 'n');
		
		System.out.print("\nNome: ");
		nome = sc.next();
		System.out.print("Cor: ");
		cor = sc.next();
		System.out.print("Peso: ");
		peso = sc.nextDouble();
		
		cachorroB = new Cachorro(nome, cor, peso);
		
		do {
			System.out.print("O cachorro latiu (s/n)? ");
			resp = sc.next().charAt(0);
			
			if (resp == 's') {
				cachorroB.latir();			
			}
			
		} while (resp != 'n');
		
		System.out.println("\nNome: " + cachorroA.getNome());
		System.out.println("Cor: " + cachorroA.getCor());
		System.out.println("Raça de porte: " + cachorroA.porte());
		System.out.println("Quantidade de latidos: " + cachorroA.getLatido());
		
		System.out.println("\nNome: " + cachorroB.getNome());
		System.out.println("Cor: " + cachorroB.getCor());
		System.out.println("Raça de porte: " + cachorroB.porte());
		System.out.println("Quantidade de latidos: " + cachorroB.getLatido());
		
		cachorroA.comparacaoCores(cachorroB);
		
		sc.close();

	}

}
