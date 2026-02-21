package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Numero;

public class AnaliseNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Numero> list = new ArrayList<>();
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			Integer numero = sc.nextInt();
			list.add(new Numero(numero));
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		Numero.negativos(list);
		
		sc.close();

	}

}
