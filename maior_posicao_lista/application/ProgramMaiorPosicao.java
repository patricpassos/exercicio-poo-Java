package application;

import java.util.Locale;
import java.util.Scanner;

import entities.MaiorLista;

public class ProgramMaiorPosicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		MaiorLista lista = new MaiorLista();
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			Double elemento = sc.nextDouble();
			lista.addElementos(elemento);
		}
		
		System.out.println(lista);
		
		sc.close();

	}

}
