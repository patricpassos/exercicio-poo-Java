package application;

import java.util.Locale;

import entities.CarEn;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		try {
			CarEn car01 = new CarEn();
			car01.setCompany("Chevrolet");
			car01.setModel("Cruze");
			car01.setYear(2009);
			car01.drive(0.0);
			car01.drive(250.0);
			car01.drive(250.0);
			car01.drive(400.0);
			car01.setSpeedometer(80);
			car01.setSpeedometer(150);
			double fuelEfficiency = car01.calculateFuelEfficiency(50.0, 25);
			System.out.println(car01);
			
			System.out.printf("Fuel efficiency: %.2f", fuelEfficiency);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		
		//Escreva um programa em Java onde a classe "Carro" impeça a definição de um ano anterior a 1886 (ano do primeiro carro).
		//Escreva um programa em Java onde a classe "Carro" inclua um método para calcular a eficiência de combustível.
		//Escreva um programa em Java onde a classe "Carro" permita atualizar a quilometragem somente através de um método de condução (drive).
		//Escreva um programa em Java onde a classe "Carro" suporte a definição de um limite máximo de velocidade.

	}

}
