package entities;

public class Cat {

	private String name;
	private int age;
	private String breed;
	private double weight;

	public Cat() {
		this("Unknown", 0, "Unknown", 1.0);
	}

	public Cat(String name, int age, String breed, double weight) {
		this.name = name;
		this.age = validateAge(age);
		this.breed = breed;
		this.weight = validateWeight(weight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = validateAge(age);
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = validateWeight(weight);
	}

	public boolean isKitten() {
		return age < 1;
	}

	// Deitel Cap.02: Fail-Fast
	public static int validateAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative!");
		}
		return age;
	}

	// Deitel Cap.02: Fail-Fast
	public static double validateWeight(double weight) {
		if (weight <= 0) {
			throw new IllegalArgumentException("Weight must be greater than zero!");
		}
		return weight;
	}

	public Cat compareAge(Cat otherCat) {
		if (this.age > otherCat.age) {
			return this;
		} else if (otherCat.age > this.age) {
			return otherCat;
		} else {
			return null;
		}
	}

	@Override
	public String toString() {
		return String.format("Cat's Name: %s" +
							 "\nCat's Age: %d" +
							 "\nCat's Breed: %s" +
							 "\nCat's Weight: %.2f" + 
							 "\nCat is: %s", 
							 name, age, breed, weight, (isKitten() ? "Kitten" : "Adult"));
	}

}
