package entities;

public enum Genre {
	
	FANTASY, FICTION, ROMANCE, TECHNICAL;
	
	public static Genre fromString(String genre) {
		if(genre == null || genre.isBlank()) {
			throw new IllegalArgumentException("Incorrect genre");
		}
		
		for(Genre literaryGenre : Genre.values()) {
			if(literaryGenre.name().equalsIgnoreCase(genre)) {
				return literaryGenre;
			}
		}
		throw new IllegalArgumentException("The genre '" + genre + "' does not exist.");
	}

}
