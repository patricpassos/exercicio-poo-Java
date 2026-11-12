package application;

import entities.Smartphone;

public class ProgramSmartphone {

	public static void main(String[] args) {
		
		try {
			Smartphone smartphone = new Smartphone("Sony Ericsson", "W595 ", 20, 50);
			smartphone.increaseStorage(30);
			smartphone.setBattery(90);
			System.out.println(smartphone);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		//Escreva um programa em Java onde a classe "Smartphone" impeça a definição de um tamanho de armazenamento inválido.
		//Escreva um programa em Java onde a classe "Smartphone" inclua um método para monitorar o uso da bateria.
		//Escreva um programa em Java onde a classe "Smartphone" permita aumentar o armazenamento apenas até um limite máximo.
		//Escreva um programa em Java onde a classe "Smartphone" inclua um método para exibir as especificações completas.

	}

}
