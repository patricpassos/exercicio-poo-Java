package application;

import entities.Singleton;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Singleton instance01 = Singleton.getInstance();
		instance01.quantityLogs();
		instance01.quantityLogs();
		System.out.println(instance01);
		Singleton.resetInstance();
		
		Singleton instance02 = Singleton.getInstance();
		instance02.quantityLogs();
		System.out.println(instance02);
		
		
		//Escreva um programa em Java onde a classe "Singleton" implementa um sistema de registro (logging) para rastrear eventos da aplicação.
		//Escreva um programa em Java onde a classe "Singleton" suporte um método para redefinir a instância, se necessário.
		//Escreva um programa em Java onde a classe "Singleton" inclua um método para recuperar a contagem de instâncias.
		//Escreva um programa em Java onde a classe "Singleton" implemente a segurança de threads para aplicações multithread.


	}

}
