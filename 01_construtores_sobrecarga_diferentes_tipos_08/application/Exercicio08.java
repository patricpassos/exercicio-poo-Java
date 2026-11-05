package application;

import java.util.Locale;

import entities.Point;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Point point01 = new Point(4, 5);
		System.out.println(point01);
		
		Point point02 = new Point(4.5, 5.5);
		System.out.println(point02);
		
		System.out.printf("d(A,B) = %.2f units%n", point01.calculateDistancebetweenTwoPoints(point02));
		System.out.printf("Same point: %s%n%n", (point01.isSamePoint(point02) ? "YES" : "NON"));
		
		Point point03 = new Point(1, -2);
		System.out.println(point03);
		
		Point point04 = new Point(5, 3);
		System.out.println(point04);
		
		System.out.printf("d(A,B) = %.2f units%n", point03.calculateDistancebetweenTwoPoints(point04));
		System.out.printf("Same point: %s%n%n", (point03.isSamePoint(point04) ? "YES" : "NON"));
		
		
		try {
			Point point05 = new Point(3, 4);
			point05.movePoint(2, -5);
			point05.reflection('x');
			System.out.println(point05);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		// Escreva um programa em Java onde a classe "Point" inclua um método para calcular a distância entre dois pontos.
		// Escreva um programa em Java onde a classe "Point" implemente um método para determinar se dois pontos são iguais.
		// Escreva um programa em Java onde a classe "Point" suporte um método para mover o ponto por um deslocamento dado.
		// Escreva um programa em Java onde a classe "Point" inclua um método para refletir o ponto em relação ao eixo X ou Y.

	}

}
