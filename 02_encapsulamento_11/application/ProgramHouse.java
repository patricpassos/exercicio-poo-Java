package application;

import java.util.Locale;

import entities.Address;
import entities.House;
import entities.Renovation;


public class ProgramHouse {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		//STANDALONE_HOUSE, CONDOMINIUM_HOUSE, TWO_STORY_HOUSE;
		
		try {
			Address address = new Address("Rua Boa vista", "2834-C", -23.859, 58.648);
			House house = new House(address, "CONDOMINIUM_HOUSE", 80.0, 120.0, 2500.0, 1500.0);
			System.out.println(house);
		} catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			Address address01 = new Address("Rua Caramelho", "289", 25.897, 62.785);
			House house01 = new House(address01, "standalone_house", 50.0, 80, 1750, 1200.0);
			Renovation bedroom01 = new Renovation("Bedroom", 34.0, 1200.0, 10, "social", "simple");
			
			System.out.println("\n" + house01);
			System.out.println("\n" + bedroom01);
			
			
			
		} catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		//Escreva um programa em Java onde a classe "Casa" impeça a atribuição de valores negativos para cômodos ou área.
		//Escreva um programa em Java onde a classe "Casa" inclua um método para estimar os custos de reforma.
		//Escreva um programa em Java onde a classe "Casa" calcule o preço total com base em características adicionais.
		//Escreva um programa em Java onde a classe "Casa" permita definir uma localização e um tipo de propriedade.

	}

}
