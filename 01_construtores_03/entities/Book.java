package entities;

public class Book {
	
	private String title;
	private String author;
	private double price;
	private boolean bestSeller;
	private double sumNotes;
	private int reviewsCount;
	
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.price = 0.0;
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.price = 0.0;
	}

	public Book(String title, String author, double price, boolean bestSeller) {
		this.title = title;
		this.author = author;
		this.price = validatePrice(price);
		this.bestSeller = bestSeller;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}
	
	public double discountPrice(double discountPercentage) {
		if (discountPercentage > 0.0 && discountPercentage <= 100.0) {
            double discount = price * (discountPercentage / 100.0);
            return price - discount;
        }
        return price;
	}
	
	public boolean hasSamePrice(Book otherBook) {
		return this.price == otherBook.price;
	}
	
	public boolean isBestSeller() {
		return bestSeller;
	}
	
	public void addReview(double notes) {
		if(notes >= 1.0 && notes <= 5.0) {
			sumNotes += notes;
			reviewsCount++;
		}
	}
	
	public double getAverageRating() {
		if(reviewsCount == 0) {
			return 0.0;
		}
		return sumNotes / reviewsCount;
	}
	
	 public static double validatePrice(double price) {
		 if(price < 0.0) {
			 throw new IllegalArgumentException("Price cannot be negative!");
		 }
	     return price;
	 }
	
	@Override
	public String toString() {
		return
				"Title: " + title + "\n" +
				"Author: " + author + "\n" +
				 String.format("Price: $%.2f\n", price) + 
				 String.format("Rating: %.1f\n", getAverageRating()) +
				 "Best Seller: " + (bestSeller ? "Yes" : "No");
	}

}
