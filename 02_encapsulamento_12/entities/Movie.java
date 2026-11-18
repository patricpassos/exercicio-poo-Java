package entities;

public class Movie {

	private String title;
	private String director;
	private int duration;
	private int numberViews;
	
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
	
	public void setNumberViews(int views) {
		if(views < 0) {
			throw new IllegalArgumentException("the display quantity cannot be negative");
		}
		this.numberViews += views;
	}
	
	//fail-fast
	private static int validateDuration(int duration) {
		if(duration <= 0) {
			throw new IllegalArgumentException("the duration of the film cannot be negative.");
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
				"Title: " + getTitle() + "\n" +
				"Director: " + getDirector() + "\n" +
				String.format("Duration minutes: %d%n", getDuration()) + 
				String.format("Number of views: %d", numberViews);
	}
	
}
