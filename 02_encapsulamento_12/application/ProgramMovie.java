package application;

import entities.Movie;

public class ProgramMovie {
	
	public static void main(String[] args) {
		
		try {
			Movie movie01 = new Movie();
			movie01.setTitle("Batman: The Dark Knight");
			movie01.setDirector("Christopher Nolan ");
			movie01.setDuration(152);
			movie01.setNumberViews(2);
			movie01.setNumberViews(2);
			movie01.setNumberViews(4);
			System.out.println(movie01);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
