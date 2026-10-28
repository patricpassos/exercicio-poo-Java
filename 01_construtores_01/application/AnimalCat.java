package application;

import java.util.Locale;

import entities.Cat;

public class AnimalCat {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		try {
			Cat cat01 = new Cat("Pedro", 2, "Persa", 2.75);
			Cat cat02 = new Cat("Jose", 4, "Siamês", 1.75);
			
			System.out.println("***Cat's A***");
			System.out.println(cat01);
			System.out.println("\n\n***Cat's B***");
			System.out.println(cat02);
			
			Cat maisVelho = cat01.compareAge(cat02);
            if (maisVelho != null) {
                System.out.println("\nthe oldest cat is the " + maisVelho.getName());
            }
			
		} catch(IllegalArgumentException e) {
			 System.err.println("Unexpected error during initial registration: " + e.getMessage());
		}

	}

}
