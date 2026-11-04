package entities;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = validateDimension(length);
		this.width = validateDimension(width);
	}
	
	public Rectangle(Rectangle rectangle) {
		this.length = rectangle.length;
		this.width = rectangle.width;
	}
	
	//fail-fast
	public static double validateDimension(double value) {
		if(value <= 0.0) {
			throw new IllegalArgumentException("Dimension must be greater than 0.0 (received: " + value + ")");
		}
		return value;
	}

	public void setLength(double length) {
		this.length = validateDimension(length);;
	}

	public void setWidth(double width) {
		this.width = validateDimension(width);
	}
	
	public double areaRectangle() {
		return length * width;
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	public boolean hasSameDimension(Rectangle r2, Rectangle r3) {
		return this.length == r2.length && this.width == r2.width && this.length == r3.length && this.width == r3.width;
	}
	
	@Override
	public String toString() {
		return String.format("Rectangle Length: %.1f%n", length) + 
			   String.format("Rectangle width: %.1f%n", width) +
			   String.format("Area of the Rectangle: %.1f%n" , areaRectangle()) +
		       "The figure formed is a square: " + (isSquare() ? "Yes" : "No");
	}
	
}
