package entities;

import entities.enums.GenreFilm;

public class Movie {

	private String title;
	private String director;
	private int duration;
	private int numberViews;
	private GenreFilm genre;
	
	public Movie(String title, String director, int duration, String genre) {
		this.title = validateValueStr(title);
		this.director = validateValueStr(director);
		this.duration = validateDuration(duration);
		this.genre = GenreFilm.fromString(genre);
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = validateValueStr(title);
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director = validateValueStr(director);
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = validateDuration(duration);
	}
	
	public void registerViews(int views) {
		if(views < 0) {
			throw new IllegalArgumentException("Views to register must be greater than zero.");
		}
		this.numberViews += views;
	}

	public GenreFilm getGenre() {
		return genre;
	}

	public void setGenre(String gender) {
		this.genre = GenreFilm.fromString(gender);
	}

	//fail-fast
	private static int validateDuration(int duration) {
		if(duration <= 0) {
			throw new IllegalArgumentException("Movie duration must be greater than zero.");
		}
		return duration;
	}
	
	private static String validateValueStr(String value) {
		if(value == null || value.isBlank()) {
			throw new IllegalArgumentException("Value incorrect.");
		}
		return value.trim();
	}
	
	@Override
	public String toString() {
		return 
				"Title: " + title + "\n" +
				"Director: " + director + "\n" +
				"Genre: " + getGenre().name().toLowerCase().replace("_", " ") + "\n" +
				String.format("Duration minutes: %d%n", getDuration()) + 
				String.format("Number of views: %d%n", numberViews);
	}
	
}
