package entities;

public class Rectangle02 {
	
	private double width;
	private double length;
	
	public Rectangle02(double width, double length) {
		this.width = validateValue(width);
		this.length = validateValue(length);
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		resizeByWidth(width);
	}

	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		resizeByLength(length);
	}
	
	public boolean isSquare() {
		return getWidth() == getLength();	
	}
	
	public double calculateDiagonal() {
		return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getLength(), 2));
	}
	
	public double getAspectRatio() {
		return width / length;
	}

	public void resizeByWidth(double newWidth) {
		double validWidth = validateValue(newWidth);
		double ratio = getAspectRatio();
		this.width = validWidth;
		this.length = validWidth / ratio;
	}
	
	public void resizeByLength(double newLength) {
		double validLength = validateValue(newLength);
		double ratio = getAspectRatio();
		this.length = validLength;
		this.width = validLength * ratio;
	}
	
	public static double validateValue(double value) {
		if (value <= 0.0) {
			throw new IllegalArgumentException("The dimension value must be greater than zero.");
		}
		return value;
	}
	
	@Override
	public String toString() {
		return String.format("Width: %.2f | Length: %.2f | Aspect Ratio: %.2f%n", getWidth(), getLength(), getAspectRatio()) +
			   "Geometric figure: " + (isSquare() ? "Square" : "Rectangle") + "\n" +
			   String.format("Diagonal: %.2f%n", calculateDiagonal());
	}

}
