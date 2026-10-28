package application;

import java.util.Locale;

import entities.Book;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		try {
			
			Book book1 = new Book();
			System.out.println("Book1");
			System.out.println(book1);
			
			Book book2 = new Book("Amatka", "Karin Tidbeck");
	        System.out.println("\nBook2 Title: " + book2.getTitle());
	        System.out.println("Book2 Author: " + book2.getAuthor());
	        System.out.println("Book2 Price: " + book2.getPrice());
	        
	        Book book3 = new Book("Altered Carbon", "Richard K. Morgan", 18.99 , false);
	        System.out.println("\nBook3");
	        System.out.println(book3);
	        double discount = book3.discountPrice(15.0);
	        System.out.printf("New discounted price %.2f", discount);
	        
	        Book book4 = new Book("Harry Potter", "J.K. Rowling", 31.50, true);
	        book4.addReview(2.0);
	        book4.addReview(3.5);
	        System.out.println("\n\nBook4");
	        System.out.println(book4);
	        discount = book4.discountPrice(0.0);
	        System.out.printf("New discounted price %.2f", discount);
	        System.out.println("\n\nBook 3 and book 4 have the same price: " + ((book4.hasSamePrice(book3))? "Yes" : "No"));
			
		} catch(IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

}
