package application;

import java.util.Locale;

import entities.House;

public class ProgramHouse {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		House house = new House();
		house.setAddress("abc n 34");
		house.setNumberOfRooms(5);
		house.setArea(130.5);
		
		System.out.println(house);
		System.out.println("Price: " + house.calculatePrice(2000.0));
		
		
		
		//Escreva um programa em Java onde a classe "Casa" impeça a atribuição de valores negativos para cômodos ou área.
		//Escreva um programa em Java onde a classe "Casa" inclua um método para estimar os custos de reforma.
		//Escreva um programa em Java onde a classe "Casa" calcule o preço total com base em características adicionais.
		//Escreva um programa em Java onde a classe "Casa" permita definir uma localização e um tipo de propriedade.

	}

}
