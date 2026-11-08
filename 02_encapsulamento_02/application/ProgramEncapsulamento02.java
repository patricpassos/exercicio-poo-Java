package application;

import entities.BankAccount;

public class ProgramEncapsulamento02 {

	public static void main(String[] args) {
		
		try {
			BankAccount account01 = new BankAccount(2000.0);
			System.out.println(account01);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			BankAccount account02 = new BankAccount(250);
			System.out.println(account02);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			BankAccount account03 = new BankAccount(0.0);
			account03.deposit(258.75);
			account03.withdrawal(48.0);
			System.out.println(account03);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		//Escreva um programa em Java onde a classe "BankAccount" impeça a criação de um saldo negativo.
		//Escreva um programa em Java onde a classe "BankAccount" inclua um método para verificar se o saldo é suficiente para um saque.
		//Escreva um programa em Java onde a classe "BankAccount" gere um número de conta único para cada nova conta.
		//Escreva um programa em Java onde a classe "BankAccount" restrinja o acesso à modificação do saldo fora dos métodos de depósito e saque.

	}

}
