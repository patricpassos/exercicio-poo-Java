package entities.enums;

public enum GenreFilm {
	
	HORROR,
	SUPERHERO_MAJOR_FRANCHISES,
	ACTION,
	SCI_FI,
	DRAMA,
	ANIMATION;
	
	public static GenreFilm fromString(String genre) {
		if(genre == null || genre.isBlank()) {
			throw new IllegalArgumentException("The genre cannot be null or empty.");
		}
		
		try {
			return GenreFilm.valueOf(genre.trim().toUpperCase().replace(" ", "_"));
		} catch(IllegalArgumentException e) {
			throw new IllegalArgumentException("Invalid genre.");
		}
	}
	
}
