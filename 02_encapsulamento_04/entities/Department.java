package entities;

public enum Department {
	
	ENGINEERING,
	MAINTENANCE,
	QUALITY,
	ADMINISTRATION;

	public static Department fromString(String department) {
		if (department == null || department.isBlank()) {
			throw new IllegalArgumentException("Department cannot be null or blank.");
		}
		
		for (Department dept : Department.values()) {
			if (dept.name().equalsIgnoreCase(department)) {
				return dept;
			}
		}
		throw new IllegalArgumentException("The department '" + department + "' does not exist.");
	}
}
