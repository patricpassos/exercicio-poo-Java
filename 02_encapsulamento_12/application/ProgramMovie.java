package application;

import java.util.List;

import entities.Movie;
import entities.MovieCatalog;

public class ProgramMovie {
	
	public static void main(String[] args) {
		
		try {
			
			Movie movie01 = new Movie("Batman: The Dark Knight", "Christopher Nolan ", 152, "action", 25.00);
			
			movie01.registerViews(2);
			movie01.registerViews(2);
			movie01.registerViews(4);
			
			Movie movie02 = new Movie("Inception", "Christopher Nolan", 148, "SCI_FI", 35.00);
			movie02.registerViews(12);

			Movie movie03 = new Movie("Mad Max: Fury Road", "George Miller", 120, "Action", 45.00);
			movie03.registerViews(5);
			System.out.println(movie01);
			System.out.println(movie02);
			System.out.println(movie03);
			
			MovieCatalog catalog = new MovieCatalog();
			catalog.addMovie(movie01);
			catalog.addMovie(movie02);
			catalog.addMovie(movie03);
			
			System.out.println("=== ACTION MOVIES ===");
			List<Movie> actionMovies = catalog.filterMovie("action");
			for (Movie movie : actionMovies) {
				System.out.println(movie);
				System.out.println("---------------------");
			}
			
			
			
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
