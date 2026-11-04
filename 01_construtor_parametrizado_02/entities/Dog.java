package entities;

public class Dog {

	private String name;
	private String color;
	private double weight;
	private boolean trained;
	private int barksCount;

	public Dog(String name, String color, double weight, boolean trained) {
		this.name = name;
		this.color = color;
		this.weight = validateWeight(weight);
		this.trained = trained;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}
	
	public boolean isTrained() {
		return trained;
	}

	public int getBarksCount() {
		return barksCount;
	}

	public void setWeight(double weight) {
		this.weight = validateWeight(weight);
	}

	public void bark() {
		this.barksCount++;
	}
	
	public String getPhysique() {
		return switch (Double.valueOf(weight)) {
		case Double l when l <= 5.0 -> "Mini/Toy";
		case Double l when l <= 15.0 -> "Small";
		case Double l when l <= 25.0 -> "Medium";
		default -> "Large";
		};
	}

	public boolean hasSameColors(Dog otherDog) {
		if (otherDog == null) {
			return false;
		}
		return this.color.equalsIgnoreCase(otherDog.color);
	}

	public static double validateWeight(double weight) {
		if (weight <= 0) { throw new IllegalArgumentException("Weight must be greater than zero!");} 
		return weight;
	}

	@Override
	public String toString() {
		return "Dog's Name: " + getName() + "\n" + 
			   "Dog's Color: " + getColor() + "\n" + 
			   "Dog's is trained: " + (isTrained() ? "Yes" : "No") + "\n" + 
			   "Dog's Physique: " + getPhysique() + "\n" + 
			   "Total number of barks: " + barksCount + "\n";
	}

}
