package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y; // variavel do tipo Triangle (Ctrl + shift + o) **memoria stack
		x = new Triangle(); // instanciação(criação do objeto x) **memoria heap
		y = new Triangle(); // instanciação(criação do objeto y) **memoria heap

		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//Chamada do metodo
		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);

		if (areaX > areaY) {
			System.out.println("Large area: X");
		} else {
			System.out.println("Large area: Y");
		}
		sc.close();

	}

}
