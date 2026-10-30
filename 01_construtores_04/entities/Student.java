package entities;

public class Student {
	
	public static final double DAYS_WEEK = 5.0;
	
	private int studentId;
	private String studentName;
	private int age;
	private double grade01;
	private double grade02;
	private double grade03;
	private double grade04;
	private String status;
	private int attendanceCount;
	private char Gpa;

	public Student() {
		this(0, "Unknown", 0, 0.0, 0.0, 0.0, 0.0);
	}

	public Student(int studentId, String studentName, int age, double grade01, double grade02, double grade03, double grade04) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.grade01 = validateGrade(grade01);
		this.grade02 = validateGrade(grade02);
		this.grade03 = validateGrade(grade03);
		this.grade04 = validateGrade(grade04);
		this.status = "Pending";
	}

	//fail-fast
	public static double validateGrade(double grade) {
		if (grade < 0.0 || grade > 10.0) {
			throw new IllegalArgumentException("Invalid grade (" + grade + ")! Must be between 0.0 and 10.0");
		}
		return grade;
	}
	
	public void addClassFrequency(char presence) {
		if(Character.toLowerCase(presence) == 'v') {
			attendanceCount++;
		} 
	}
	
	public int getAttendancePercentage() {	
		return (int) ((attendanceCount / DAYS_WEEK) * 100.0);
	}
	
	public double averageGrades() {
		return (grade01 + grade02 + grade03 + grade04) / 4;
	}
	
	public void updateStatus() {
		status = (averageGrades() >= 6.0) ? "Passed" : "Failed";
	}
	
	public double weightedAverage() {
		double sumWeightedNotes = grade01 * 2.0 + grade02 * 2.0 + grade03 * 3.0 + grade04 * 3.0;
		return (sumWeightedNotes == 0.0) ? 0.0 : sumWeightedNotes / 10.0;
	}
	
	public void Gpa() {
		Gpa = weightedAverage() >= 8.0 ? 'A' : weightedAverage() >= 6.0 ? 'B' : 'C';
	}
	
	public boolean hasSameGpa(Student otherStudent) {
		return this.Gpa == otherStudent.Gpa;
	}
	
	@Override
	public String toString() {
		return 
				"Id student: " + studentId + "\n" +
				"Name: " + studentName + "\n" +
				"Age: " + age + "\n" +
				String.format("Average of grades %.2f%n", averageGrades()) +
				"Status: " + status + "\n" +
				//"Grande: " + status + "\n" + 
				//"teste: " + sumNotes + "\n" +
				"GPA: " + Gpa + "\n" +	
				//String.format("Amedia ponderada %.2f%n", weightedAverage()) +
				String.format("Percentage of classes attended: %d%% ", getAttendancePercentage());
	}

}
