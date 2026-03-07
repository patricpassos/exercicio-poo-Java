package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Maior;

public class ProgramMaior {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de números: ");
		int n = sc.nextInt();
		
		Maior vetor = new Maior(n);
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			double elemento = sc.nextDouble();
			vetor.addElemento(i, elemento);
		}
		
		System.out.println(vetor);
		
		sc.close();

	}

}
