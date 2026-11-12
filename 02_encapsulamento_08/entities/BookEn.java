package entities;

public class BookEn {

	private String title;
	private String author;
	private double price;
	private Genre genre;
	
	public String getGenre() {
		return genre.name().toLowerCase();
	}

	public void setGenre(String genre) {
		this.genre = Genre.fromString(genre);
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = validateValue(title);
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = validateValue(author);
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = validatePrice(price);
	}
	
	public void applyDiscount(double percentage) {
		if(percentage < 0.0 || percentage > 80.0) {
			throw new IllegalArgumentException("Incorrect percentage.");
		}
		this.price -= this.price * (percentage / 100.0);
	}
	
	public double estimatedReadingtime(int numberPages, double minutesPages) {
		if(numberPages < 0 || minutesPages < 0.0) {
			throw new IllegalArgumentException("Number of pages and minutes cannot be negative.");
		}
		return numberPages * minutesPages;
	}
	
	//fail-fast
	public static String validateValue(String value) {
		if(value == null || value.isBlank()) {
			throw new IllegalArgumentException("Incorrect value");
		}
		return value;
	}
	
	public static double validatePrice(double price) {
		if(price < 0.0) {
			throw new IllegalArgumentException("Icorrect price.");
		}
		return price;
	}
	
	@Override
	public String toString() {
		return
				"Title: " + getTitle() + "\n" +
				"Author: " + getAuthor() + "\n" +
				"Literary genre: " + getGenre() + "\n" +
				String.format("Price ($) .............: %.2f%n", getPrice());
	}
}
