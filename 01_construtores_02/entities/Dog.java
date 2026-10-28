package entities;

public class Dog {

	private String name;
	private String color;
	private int barksCount;
	private boolean trained;
	private double weight;

	public Dog(String name, String color, boolean trained, double weight) {
		this.name = name;
		this.color = color;
		this.trained = trained;
		this.weight = validateWeight(weight);
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getBarksCount() {
		return barksCount;
	}

	public void setTrained(boolean trained) {
		this.trained = trained;
	}

	public void bark() {
		barksCount++;
	}

	public boolean isTrained() {
		return trained;
	}

	public String largeBreed() {
		return switch (Double.valueOf(weight)) {
		case Double l when l <= 5.0 -> "Mini/Toy";
		case Double l when l <= 15.0 -> "Pequeno";
		case Double l when l <= 25.0 -> "Medio";
		default -> "Grande";
		};
	}

	public boolean hasSameColors(Dog otherDog) {
		if (otherDog == null) {
			return false;
		}
		return this.color.equalsIgnoreCase(otherDog.color);
	}

	public static double validateWeight(double weight) {
		if (weight <= 0) {
			throw new IllegalArgumentException("Weight must be greater than zero!");
		} 
		return weight;
	}

	@Override
	public String toString() {
		return "Dog's Name: " + name + "\n" + 
			   "Dog's Color: " + color + "\n" + 
			   "Dog's is trained: " + trained + "\n" + 
			   "Dog's Physique: " + largeBreed() + "\n" + 
			   "Total number of barks: " + barksCount + "\n";
	}

}
