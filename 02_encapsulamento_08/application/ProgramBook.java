package application;

import java.util.Locale;

import entities.BookEn;

public class ProgramBook {

	public static void main(String[] args) {
		
		//FANTASY, FICTION, ROMANCE, TECHNICAL;
		Locale.setDefault(Locale.US);
		
		try {
			BookEn book01 = new BookEn();
			book01.setTitle("A song of Ice and Fire");
			book01.setAuthor("George R. R. Martin");
			book01.setPrice(50.0);
			book01.applyDiscount(50.0);
			book01.applyDiscount(10.0);
			book01.setGenre("FANTASY");
			double readingEstimate = book01.estimatedReadingtime(250, 10.0);
			System.out.println(book01);
			System.out.printf("Reading estimate in hours: %.0f hours and %.0f minutes%n", readingEstimate / 60.0, readingEstimate % 60.0);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		//Escreva um programa em Java onde a classe "Book" impeça a definição de um preço negativo.
		//Escreva um programa em Java onde a classe "Book" inclua um método para aplicar múltiplos descontos.
		//Escreva um programa em Java onde a classe "Book" permita definir gêneros, mas apenas a partir de uma lista predefinida.
		//Escreva um programa em Java onde a classe "Book" calcule o tempo estimado de leitura com base no número de páginas.

	}

}
