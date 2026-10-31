package application;

import java.util.Locale;

import entities.Rectangle;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Rectangle rec01 = new Rectangle(12.5, 4.5);
		System.out.println("Dimensions of the rectangle 01");
		System.out.println(rec01);
        
        Rectangle rec02 = new Rectangle(rec01);
        System.out.println("\nDimensions of the rectangle 02");
		System.out.println(rec02);
		
		Rectangle rec03 = new Rectangle(rec02);
		System.out.println("\nDimensions of the rectangle 03");
		rec03.setLength(15.0);
		rec03.setWidth(5.0);
		System.out.println(rec03);
		
		Rectangle rec04 = new Rectangle(10.0, 10.0);
		System.out.println("\nDimensions of the rectangle 04");
		System.out.println(rec04);
		
		boolean allRetangleEquals = rec01.hasSameDimension(rec02, rec03);
		System.out.println("Are the three rectangles identical? " + (allRetangleEquals ? "Yes" : "No"));
		
		// Escreva um programa em Java onde a classe "Rectangle" inclua um método para calcular e retornar a área.
		// Escreva um programa em Java onde a classe "Rectangle" inclua um método para verificar se dois retângulos são iguais.
		// Escreva um programa em Java onde a classe "Rectangle" permita modificar o comprimento e a largura após a sua criação.
		// Escreva um programa em Java onde a classe "Rectangle" inclua um método para determinar se ela é um quadrado.

	}

}
