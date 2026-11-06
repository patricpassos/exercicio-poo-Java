package entities;

import java.util.Arrays;

public class Classroom {
	
	private String className;
	private String[] students;
	
	public Classroom(String className, String[] students) {
		this.className = validateClassName(className);
		this.students = validateStudents(students);
	}

	public int totalStudents() {
		return students.length;
	}
	
	public void addStudent(String studentName) {
		String validName = validateStudentName(studentName);
		students = Arrays.copyOf(students, students.length + 1);
		students[students.length - 1] = validName;
	}
	
	public boolean removeStudent(String studentName) {
		for (int i = 0; i < students.length; i++) {
	        if (students[i].equalsIgnoreCase(studentName)) {
	            for (int j = i; j < students.length - 1; j++) {
	                students[j] = students[j + 1];
	            }
	            students = Arrays.copyOf(students, students.length - 1);
	            return true;
	        }
	    }
	    return false;
	}
	
	public String[] getStudentsSorted() {
		String[] sortedStudent = students.clone();
		Arrays.sort(sortedStudent);
		return sortedStudent;
	}
	
	public boolean hasStudents(String name) {
		if (name == null) return false;
		for(String student : students) {
			if(student.equalsIgnoreCase(name)) {
				return true;
			}
		}
		return false;
	}
	
	// Validações Fail-Fast
	public static String validateClassName(String className) {
		if (className == null || className.isEmpty()) {
			throw new IllegalArgumentException("Class name cannot be null or empty!");
		}
		return className;
	}
	
	public static String validateStudentName(String studentName) {
		if (studentName == null || studentName.trim().isEmpty()) {
			throw new IllegalArgumentException("Student name cannot be null or empty!");
		}
		return studentName;
	}
	
	public static String[] validateStudents(String[] students) {
        if (students == null) {
            throw new IllegalArgumentException("The students array cannot be null!");
        }
        return students.clone(); // Clona com segurança para proteger o atributo privado
    }
	
	@Override
	public String toString() {
		return 
				"Class Name: " + className + "\n" +
				String.format("Total number of enrolled students: %d%n", totalStudents()) +
				"Students: " + String.join(", ", students) + "\n" +
				"Alphabetical ordering of the students: " + String.join(", " , getStudentsSorted());
				
	}
	
}
