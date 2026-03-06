package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cadastro;
import services.Operacao;

public class ProgramAltura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão cadastradas? ");
		int n = sc.nextInt();
		
		Operacao vetor = new Operacao(n);
		
		for(int i = 0; i < vetor.tamanhoVetor(); i++) {
			System.out.printf("Dados da %d° pessoa: \n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vetor.setElemento(i, nome, idade, altura);
		}
		
		double mediaIdade = vetor.mediaAltura();
		System.out.printf("Altura média = %.2f", mediaIdade);
		
		sc.close();
		
	}

}
