package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Soma;

public class SomaVetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int tamanhoVetor = sc.nextInt();
		
		Soma vetor = new Soma(tamanhoVetor);
		
		for(int i = 0; i < vetor.tamanhoVetor(); i++) {
			System.out.print("Digite um número: ");
			double elemento = sc.nextDouble();
			vetor.setElemento(i, elemento);
		}
		
		double somaVetores = vetor.soma();
		double mediaVetores = vetor.media();
		
		System.out.print("\nVALORES: ");
		for(double v : vetor.getVet()) {
			System.out.print(v + " ");
		}
		System.out.printf("\nSOMA = %.2f", somaVetores);
		System.out.printf("\nMÉDIA = %.2f", mediaVetores);
		
		sc.close();

	}

}
