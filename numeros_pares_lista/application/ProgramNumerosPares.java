package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ListaPares;

public class ProgramNumerosPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ListaPares lista = new ListaPares();

		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			Integer elemento = sc.nextInt();
			lista.addLista(elemento);
		}

		System.out.println(lista);

		sc.close();

	}

}
