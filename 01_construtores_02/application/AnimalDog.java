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
		
		Dog dogA = dataDog(sc);
		
		Dog dogB = dataDog(sc);
		
		/*Dog dogA = new Dog("Princess", "Stell blue", true, 5.47);
		dogA.bark();
		dogA.bark();
		dogA.bark();
		
		System.out.println("Dog's Name: " + dogA.getName());
		System.out.println("Dog's Colo: " + dogA.getColor());
		System.out.println("Dog's is trained: " + dogA.isTrained());
		System.out.println("Do's Physique: " + dogA.largeBreed());
		System.out.println("Total number of barks: " + dogA.getBarksCount());
		
		Dog dogB = new Dog("Juca", "Black", false, 13.8);
		System.out.println("Dog's Name: " + dogB.getName());
		System.out.println("Dog's Colo: " + dogB.getColor());
		System.out.println("Dog's is trained: " + dogB.isTrained());
		System.out.println("Dog's Physique: " + dogB.largeBreed());
		System.out.println("Total number of barks: " + dogB.getBarksCount());
		System.out.println();
		System.out.print("Compare the colors: ");
		dogA.compareColors(dogB);*/
		
		sc.close();

	}

}
