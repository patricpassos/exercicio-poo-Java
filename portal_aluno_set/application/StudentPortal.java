package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class StudentPortal {
	
	public static void studentRegistration(Integer quantityStudent, Set<Students> setStudent, Scanner sc) {
		for(int i = 0; i < quantityStudent; i++) {
			System.out.print("Personal code: ");
			Integer personalCode = sc.nextInt();
			Students pc = new Students(personalCode);
			setStudent.add(pc);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Students> setStudent = new HashSet<>();
		Integer quantityStudent;
		
		System.out.print("How many students for course A? ");
		quantityStudent = sc.nextInt();
		studentRegistration(quantityStudent, setStudent, sc);
		
		System.out.print("\nHow many students for course B? ");
		quantityStudent = sc.nextInt();
		studentRegistration(quantityStudent, setStudent, sc);
		
		System.out.print("\nHow many students for course C? ");
		quantityStudent = sc.nextInt();
		studentRegistration(quantityStudent, setStudent, sc);
		
		System.out.println("\nTotal students: " + setStudent.size());
		
		sc.close();
	}
}
