package application;

import java.util.Locale;

import entities.Point;

public class Exercicio08 {
	
	public static void printPointComparison(Point p1, Point p2) {
        System.out.printf("d(A,B) = %.2f units%n", p1.calculateDistanceBetweenTwoPoints(p2));
        System.out.printf("Same point: %s%n%n", (p1.isSamePoint(p2) ? "YES" : "NO"));
    }

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Point point01 = new Point(4, 5);
		System.out.println(point01);
		
		Point point02 = new Point(4.5, 5.5);
		System.out.println(point02);
		
		printPointComparison(point01, point02);
		
		Point point03 = new Point(1, -2);
		System.out.println(point03);
		
		Point point04 = new Point(5, 3);
		System.out.println(point04);
		
		printPointComparison(point03, point04);
		
		try {
			Point point05 = new Point(2, 2);
			point05.movePoint(2, -5);
			point05.reflection('x');
			System.out.println(point05);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			Point point06 = new Point(3, 4);
			point06.movePoint(2, -5);
			point06.reflection('z');
			System.out.println(point06);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		// Escreva um programa em Java onde a classe "Point" inclua um método para calcular a distância entre dois pontos.
		// Escreva um programa em Java onde a classe "Point" implemente um método para determinar se dois pontos são iguais.
		// Escreva um programa em Java onde a classe "Point" suporte um método para mover o ponto por um deslocamento dado.
		// Escreva um programa em Java onde a classe "Point" inclua um método para refletir o ponto em relação ao eixo X ou Y.

	}

}
