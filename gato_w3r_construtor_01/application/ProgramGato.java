package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Gato;

public class ProgramGato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Gato gatoA = new Gato();
		gatoA.setIdade(2);
		gatoA.peso(3);
		gatoA.raca("Siamês");
		
		Gato gatoB = new Gato();
		gatoB.setIdade(3);
		gatoB.peso(1.7);
		gatoB.raca("Persa");
		
		System.out.println("Nome: " + gatoA.getNome());
		System.out.println("Idade: " + gatoA.getIdade());
		System.out.println("Peso: " + gatoA.getPeso());
		System.out.println("Raça: " + gatoA.getRaca());
		
		System.out.println("\nNome: " + gatoB.getNome());
		System.out.println("Idade: " + gatoB.getIdade());
		System.out.println("Peso: " + gatoB.getPeso());
		System.out.println("Raça: " + gatoB.getRaca());
		
		gatoA.comparacaoIdades(gatoB);
		
		sc.close();

	}

}
