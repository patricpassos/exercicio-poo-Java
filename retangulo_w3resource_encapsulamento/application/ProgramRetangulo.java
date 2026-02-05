package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class ProgramRetangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.print("Largura: ");
		double largura = sc.nextDouble();

		Retangulo retangulo = new Retangulo(comprimento, largura);

		System.out.println("Comprimento: " + retangulo.getComprimento());
		System.out.println("Largura: " + retangulo.getLargura());
		System.out.printf("Diagonal: %.2f", retangulo.diagonal());
		System.out.println("Tipo geometrico: " + retangulo.quadrado());
		
		sc.close();

	}

}
