package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Media;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		Media vetor = new Media(n);
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			double elemento = sc.nextDouble();
			vetor.setElemento(i, elemento);
		}
		
		System.out.println(vetor);
		
		sc.close();

	}

}
