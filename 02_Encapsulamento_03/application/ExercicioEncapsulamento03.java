package application;

import java.util.Locale;

import entities.Rectangle02;

public class ExercicioEncapsulamento03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		try {
			Rectangle02 rectangle01 = new Rectangle02(10.0, 5.0);
			System.out.println(rectangle01);
			
			rectangle01.resizeByWidth(20.0);
			System.out.println(rectangle01);
			
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		//Escreva um programa em Java onde a classe "Rectangle" impeça a definição de um comprimento ou largura negativos.
		//Escreva um programa em Java onde a classe "Rectangle" inclua um método para verificar se ela é um quadrado.
		//Escreva um programa em Java onde a classe "Rectangle" calcule o comprimento da diagonal.
		//Escreva um programa em Java onde a classe "Rectangle" suporte redimensionamento dinâmico, mantendo a proporção constante.

	}

}
