package application;

import java.util.Scanner;

import entities.OlderAnalyzer;

public class Older {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people are you going to type? ");
		int n = sc.nextInt();
		
		OlderAnalyzer[] vector = new OlderAnalyzer[n];
		
		for(int i = 0; i < vector.length; i++) {
			System.out.printf("Data %d° person:\n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Age: ");
			int age = sc.nextInt();
			vector[i] = new OlderAnalyzer(name, age);	
		}
		
		OlderAnalyzer.olderPerson(vector);
		
		sc.close();

	}

}
