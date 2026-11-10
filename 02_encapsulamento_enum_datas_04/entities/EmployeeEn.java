package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmployeeEn {
	
	private static final double MINIMUM_WAGE = 1621.0;
	private int id;
	private String name;
	private double salary;
	private Department department;
	private LocalDate admissionDate;

	public EmployeeEn(int id, String name, double salary, String department, LocalDate admissionDate) {
		this.id = id;
		this.name = name;
		this.salary = validateSalary(salary);
		this.department = Department.fromString(department);
		this.admissionDate = validateAdmissionDate(admissionDate);
	}
	
	public String getDepartment() {
		return department.name().toLowerCase();
	}
	
	public void salaryIncreasePercentage(double percentage) {
		if(percentage <= 0.0) {
			throw new IllegalArgumentException("Incorrect adjustment percentage");
		}
		this.salary += this.salary * (percentage / 100.0);
	}
	
	public Long calculateYearOfService() {
		return ChronoUnit.YEARS.between(admissionDate, LocalDate.now());
	}

	//fail-fast
	public static double validateSalary(double salary) {
		if(salary < MINIMUM_WAGE) {
			throw new IllegalArgumentException("Incorrect salary");
		}
		return salary;
	}
	
	public static LocalDate validateAdmissionDate(LocalDate admissionDate) {
		if(admissionDate == null || admissionDate.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Admission date cannot be null or in the future.");
		}
		return admissionDate;
	}
	
	@Override
	public String toString() {
		return
				"Id: " + id + "\n" +
				"Name: " + name + "\n" + 
				"Department: " + getDepartment() + "\n" + 
				"Years of service: " + calculateYearOfService() + "\n" +
				String.format("Salary ($) ................: %.2f%n", salary);
				
	}
	
}
