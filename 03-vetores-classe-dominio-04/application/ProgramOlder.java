package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.PeopleGroup;
import entities.Personv;

public class ProgramOlder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("How many people will you enter? ");
			
			int numberOfPeople = sc.nextInt();
			if (numberOfPeople <= 0) {throw new IllegalArgumentException("Number of people must be at least 1.");}
			
			Personv[] vectPeople = new Personv[numberOfPeople]; // vetor de classe
			
			for(int i = 0; i < vectPeople.length; i++) {
				sc.nextLine();
				System.out.printf("Data for the %dst person:%n", i + 1);
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Age: ");
				int age = sc.nextInt();
				vectPeople[i] = new Personv(name, age);
			}
			
			PeopleGroup older = new PeopleGroup(vectPeople);
			
			System.out.println("OLDER PERSON: " + older.findOldest().getName());
		} catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.err.println("Error: Invalid numeric input.");
		} finally {
			sc.close();
		}
		
		sc.close();
	}
}
