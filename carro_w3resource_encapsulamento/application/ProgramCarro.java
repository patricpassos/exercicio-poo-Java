package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;

public class ProgramCarro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Nome da empresa: ");
		String nome = sc.nextLine();
		System.out.print("Nome do modelo: ");
		String modelo = sc.nextLine();
		System.out.print("Ano: ");
		int ano = sc.nextInt();
		System.out.print("quilometragem atual: ");
		double quilometragem = sc.nextDouble();
	
		Carro carro = new Carro(nome, modelo, ano, quilometragem);
		
		System.out.println("\nEficiência veicular");
		System.out.print("Quilometros Rodados: ");
		double quilometrosRodados = sc.nextDouble();
		System.out.print("Litros abastecidos: ");
		double litros = sc.nextDouble();
		
		System.out.println(carro.status(quilometrosRodados, litros));
	
		
		
		
		sc.close();

	}

}
