package application;

import java.util.Locale;

import entities.Car;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		try {
			Car car01 = new Car("Toyota", "Corolla", 2021);
			System.out.println(car01);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			Car car02 = new Car("", "", 2002);
			System.out.println(car02);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			Car car03 = new Car("Chevrolet", "Onix", 2002);
			car03.addTrip(200.2);
			car03.addTrip(900.0);
			car03.performMaintenance(1100.2);
			car03.addTrip(200.7);
			car03.addTrip(150.5);
			System.out.println(car03);
			System.out.printf("Fuel efficiency: %.2f%n%n", car03.calculateFuelEfficiency(800.0, 44.0));
			
			Car car04 = new Car("Ford", "Blaze", 2001);
			car04.addTrip(78000.0);
			car04.addTrip(900.0);
			car04.performMaintenance(78900.0);
			System.out.println(car04);
			System.out.printf("Fuel efficiency: %.2f%n", car04.calculateFuelEfficiency(800.0, 70.0));
			
			System.out.println("Are the cars the same model?: " + (car03.isSameModel(car04) ? "Yes" : "No"));
			
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		
		// Escreva um programa em Java onde a classe "Carro" inclua um método para determinar a eficiência de combustível.
		// Escreva um programa em Java onde a classe "Carro" suporte um método para comparar dois modelos de carro.
		// Escreva um programa em Java onde a classe "Carro" registre a quilometragem total de um carro.
		// Escreva um programa em Java onde a classe "Carro" implemente um método para verificar se um carro precisa de manutenção.

	}

}
