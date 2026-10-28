package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dog;

public class AnimalDog {
	
	public static Dog dataDog(Scanner sc) {
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Color: ");
		String color = sc.nextLine();
		
		System.out.print("Is trained? (true/false): ");
		boolean trained = sc.nextBoolean();
		
		System.out.print("Weight (kg): ");
		double weight = sc.nextDouble();
		sc.nextLine(); 
		
		return new Dog(name, color, trained, weight);
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			Dog dogA = dataDog(sc);
            dogA.bark();
            dogA.bark();
            dogA.bark();
            
            Dog dogB = dataDog(sc);
            
            System.out.println("\nRegistration Details");
            
            System.out.println(dogA);
    		System.out.println();
    		System.out.println(dogB);

    		System.out.println("\nCompare the colors: " + ((dogA.hasSameColors(dogB)) ? "YES" : "NO"));
			
		} catch (IllegalArgumentException e) {
			System.out.println("Unexpected error during initial registration: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Input error: Enter the data in the correct format!");
		}
		
		sc.close();

	}

}
