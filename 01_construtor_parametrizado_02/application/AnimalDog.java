package application;

import entities.Dog;

public class AnimalDog {

	public static void main(String[] args) {
		
		try {
			
			Dog dog01 = new Dog("Bob", "Brown", 2.5, true);
			System.out.println("Data dog 01");
			dog01.bark();
			dog01.bark();
			System.out.println(dog01);
			
			Dog dog02 = new Dog("Princess", "steel blue and cinnamon", 5.5, false);
			System.out.println("Data dog 02");
			dog02.bark();
			dog02.bark();
			dog02.bark();
			dog02.bark();
			System.out.println(dog02);
			
			Dog dog03 = new Dog("Lessie", "Brown", 22.2, true);
			System.out.println("Data dog 03");
			dog03.bark();
			System.out.println(dog03);
			
			System.out.printf("Comparison between dog %s and dog %s: %s%n", dog01.getName(), dog02.getName(), ((dog01.hasSameColors(dog02)) ? "they have the same colors" : "they do not have the same colors"));
			System.out.printf("Comparison between dog %s and dog %s: %s", dog01.getName(), dog03.getName(), ((dog01.hasSameColors(dog03)) ? "they have the same colors" : "they do not have the same colors"));
			
		} catch (IllegalArgumentException e) {
			System.out.println("Unexpected error during initial registration: " + e.getMessage());
		}
		
		//Escreva um programa em Java onde a classe "Cachorro" registra quantas vezes um cachorro late.
		//Escreva um programa em Java onde a classe "Cachorro" possua um método para determinar se o cachorro é treinado.
		//Escreva um programa em Java onde a classe "Cachorro" inclua um método para comparar as cores de dois cachorros.
		//Escreva um programa em Java onde a classe "Cachorro" implemente um método para verificar se o cachorro é de raça grande.
		
	}

}
