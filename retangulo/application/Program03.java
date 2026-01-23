package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Entre com a largura e a altura do retângulo:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		double area = rectangle.area();
		double perimetro = rectangle.perimeter();
		double diagonal = rectangle.diagonal();
		
		System.out.printf("ÁREA = %.2f\n", area);
		System.out.printf("PERÍMETRO = %.2f\n", perimetro);
		System.out.printf("DIAGONAL = %.2f\n", diagonal);
		
		sc.close();

	}

}
