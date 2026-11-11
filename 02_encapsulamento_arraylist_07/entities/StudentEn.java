package entities;

import java.util.ArrayList;
import java.util.List;

public class StudentEn {

	private int id;
	private String name;
	private List<Double> grades = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = validateName(name);
	}

	public void addGrades(double grades) {
		this.grades.add(validateGrades(grades));
	}
	
	public double averageGrades() {
		double sum = 0.0;
		if(grades.isEmpty()) {
			return 0.0;
		}
		for(double g : grades) {
			sum += g;
		}
		return sum / grades.size();
	}

	//fail-fast
	public static Double validateGrades(Double grades) {
		if(grades < 0.0 || grades > 100.0) {
			throw new IllegalArgumentException("Grade must be between 0.0 and 100.0.");
		}
		return grades;
	}
	
	public static String validateName(String name) {
		if(name == null || name.isBlank()) {
			throw new IllegalArgumentException("Name cannot be null or blank.");
		}
		return name;
	}
	
	@Override
	public String toString() {
		return
				"Name: " + getName() + "\n" +
				"Id: " + getId() + "\n" +
				"Grades: " + grades.toString() + "\n" +
				String.format("Average grades: %.2f%n", averageGrades());
	}
}
