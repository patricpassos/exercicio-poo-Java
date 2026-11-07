package entities;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private int age;
	private String currentNationality;
	private List<String> nationalityHistory = new ArrayList<>();

	public String getName() {
		return (name != null) ? name.toUpperCase() : "UNKNOWN";
	}

	public void setName(String name) {
		this.name = validateName(name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = validateAge(age);
	}

	public String getCurrentNationality() {
		return currentNationality;
	}

	public void setCountry(String currentNationality) {
		String validCountry = validateCountry(currentNationality);
		this.currentNationality = validCountry;
		
		if (!nationalityHistory.contains(validCountry)) {
			this.nationalityHistory.add(validCountry);
		}
	}
	
	public void addNationality(String newNationality) {
		setCountry(newNationality);
	}
	
	public boolean isMajorityAge() {
		return getAge() >= 18;
	}

	// fail-fast
	public static String validateName(String name) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Incorrect name");
		} 
		return name;
	}
	
	public static int validateAge(int age) {
		if(age < 0) {
			throw new IllegalArgumentException("Incorrect age");
		}
		return age;
	}

	public static String validateCountry(String currentNationality) {
		if(currentNationality == null || currentNationality.isBlank()) {
			throw new IllegalArgumentException("Incorrect country");
		}
		return currentNationality;
	}
	
	@Override
	public String toString() {
		return
				"Name: " + getName() + "\n" +
				"Age: " + getAge() + "\n" + 
				"Country: " + getCurrentNationality()  + "\n" + 
				"Age of Mahority: " +  (isMajorityAge() ? "Over 18 years old" : "Is not over 18 years old") + "\n" +
				"Nationality history: " + String.join(", ", nationalityHistory) + "\n";
	}
	
}
