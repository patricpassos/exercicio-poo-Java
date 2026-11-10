package application;

import entities.CircleEn;

public class Exercicio05 {

	public static void main(String[] args) {
		
		try {
			CircleEn circle01 = new CircleEn();
			circle01.setRadius(7.0);
			System.out.println(circle01);
			
			CircleEn circle02 = new CircleEn();
			circle02.setRadius(5.0);
			System.out.println(circle02);
			circle02.scale(2.0);
			System.out.println(circle02);
			
			System.out.println("The circles are the same: " + (circle02.fitsInside(circle01) ? "Yes" : "No"));
			
		} catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		
		
		//Escreva um programa em Java onde a classe "Circle" impeça a definição de um raio negativo.
		//Escreva um programa em Java onde a classe "Circle" calcule a circunferência usando um método separado.
		//Escreva um programa em Java onde a classe "Circle" inclua um método para determinar se um círculo cabe dentro de outro.
		//Escreva um programa em Java onde a classe "Circle" suporte o redimensionamento do raio com um fator de escala.

	}

}
