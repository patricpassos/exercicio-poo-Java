package entities;

public class Personv {

	private String name;
	private int age;

	public Personv(String name, int age) {
		this.name = validateName(name);
		this.age = validateAge(age);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// fail-fast
	private static String validateName(String name) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Name cannot be null or blank.");
		}
		return name.trim();
	}

	private static int validateAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative.");
		}
		return age;
	}
}
