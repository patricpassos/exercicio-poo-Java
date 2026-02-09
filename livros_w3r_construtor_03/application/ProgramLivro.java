package application;

import java.util.Locale;

import entities.Livro;

public class ProgramLivro {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Livro livro1 = new Livro();
		System.out.println("Titulo: " + livro1.getTitulo());
		System.out.println("Autor: " + livro1.getAutor());
		System.out.println("Preço: " + livro1.getPreco());

		Livro livro2 = new Livro("O pequeno principe", "Antoine de Saint-Exupéry", 200.00, 5000);
		System.out.println("\nTitulo: " + livro2.getTitulo());
		System.out.println("Autor: " + livro2.getAutor());
		System.out.println("Preço: " + livro2.getPreco());

		if (livro2.isbestSeller()) {
			System.out.println("O livro é um best-seller");
		} else {
			System.out.println("O livro não é um best-seller");
		}

		Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 171.43, 1000000);
		livro3.percentualDeDesconto(10);
		livro3.adicionarResenha(4);
		livro3.adicionarResenha(5);
		livro3.adicionarResenha(4);

		System.out.println("\nTitulo: " + livro3.getTitulo());
		System.out.println("Autor: " + livro3.getAutor());
		System.out.println("Preço: " + livro3.getPreco());

		if (livro3.isbestSeller()) {
			System.out.println("O livro é um best-seller");
		} else {
			System.out.println("O livro não é um best-seller");
		}

		System.out.printf("Classificação do livro %s: %.2f estrelas\n", livro3.getTitulo(), livro3.classificacao());

		Livro livro4 = new Livro("harry potter e a pedra filosofal", "J.K. Rowling", 275.92, 250000);

		livro4.percentualDeDesconto(5);
		livro4.adicionarResenha(2);
		livro4.adicionarResenha(5);
		livro4.adicionarResenha(4);

		System.out.println("\nTitulo: " + livro4.getTitulo());
		System.out.println("Autor: " + livro4.getAutor());
		System.out.println("Preço: " + livro4.getPreco());

		if (livro4.isbestSeller()) {
			System.out.println("O livro é um best-seller");
		} else {
			System.out.println("O livro não é um best-seller");
		}

		System.out.printf("Classificação do livro %s: %.2f estrelas\n", livro4.getTitulo(), livro4.classificacao());

		livro2.comparacaoLivros(livro2, livro3, livro4);

	}

}
