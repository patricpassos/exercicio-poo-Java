package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;

public class Calculo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio;
		Circulo circuloA, circuloB;

		System.out.print("RaioA: ");
		raio = sc.nextDouble();
		circuloA = new Circulo(raio);

		System.out.print("RaioB: ");
		raio = sc.nextDouble();
		circuloB = new Circulo(raio);

		double areaA = circuloA.area();
		double perimetroA = circuloA.perimetro();

		double areaB = circuloB.area();
		double perimetroB = circuloB.perimetro();

		System.out.printf("\nÁrea do circulo A: %.2f\n", areaA);
		System.out.printf("Perimetro do circulo A: %.2f\n", perimetroA);

		System.out.printf("\nÁrea do circulo B: %.2f\n", areaB);
		System.out.printf("Perimetro do circulo B: %.2f\n\n", perimetroB);

		circuloA.raio(circuloB);

		sc.close();

	}

}
