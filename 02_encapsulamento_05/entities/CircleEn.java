package entities;

public class CircleEn {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = validateCircle(radius);
	}

	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public void scale(double factor) {
	    double validFactor = validateFactor(factor);
	    this.radius = this.radius * validFactor;
	}
	
	public boolean fitsInside(CircleEn otherCircle) {
		if(otherCircle == null) {
			return false;
		}
		return this.getRadius() <= otherCircle.getRadius();
	}
	
	public static double validateCircle(double radius) {
		if(radius <= 0.0) {
			throw new IllegalArgumentException("The circle does not exist");
		}
		return radius;
	}
	
	public static double validateFactor(double factor) {
		if (factor <= 0.0) {
			throw new IllegalArgumentException("The scale factor must be greater than zero.");
		}
		return factor;
	}
	
	@Override
	public String toString() {
		return
				String.format("Radius: %.2f%n", radius) +
			    String.format("Area: %.2f%n", calculateArea()) +
			    String.format("Perimeter: %.2f%n", calculatePerimeter());		
	}
}
