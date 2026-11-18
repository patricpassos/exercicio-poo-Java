package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.GenreFilm;

public class MovieCatalog {

	private final List<Movie> movies = new ArrayList<>();
	
	public List<Movie> getMovies() {
		return movies;
	}
	
	public void addMovie(Movie movie) {
		this.movies.add(movie);
	}
	
	public List<Movie> filterMovie(String genre){
		GenreFilm targetGenre = GenreFilm.fromString(genre);
		List<Movie> filteredMovies = new ArrayList<>();
		for(Movie itensMovies : movies) {
			if(itensMovies.getGenre() == targetGenre) {
				filteredMovies.add(itensMovies);
			}
		}
		return filteredMovies;
	}
	
}
