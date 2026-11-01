package application;

import java.util.Locale;

import entities.Account;

public class ConstrutorComValidacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		try {
			
			Account account01 = new Account("01", 1000.0);
			System.out.println("Data Account 01");
			System.out.println(account01);
			
		} catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			
			Account account02 = new Account("", 400.0);
			System.out.println("\nData Account 02");
			System.out.println(account02);
			
		} catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		try {
			
			Account account03 = new Account("03", -250.0);
			System.out.println("\nData Account 03");
			System.out.println(account03);

		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			
			Account account04 = new Account("04", 0.0);
			account04.accountDeposit(150.0);
			account04.accountDeposit(250.0);
			account04.accountWithdrawal(80.0);
			System.out.println(account04);
			
		} catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		
		// Escreva um programa em Java onde a classe "Account" suporte um método para depositar e sacar dinheiro.
			// dois metodos void para atualizar o saldo (saque e retirada)
		
		// Escreva um programa em Java onde a classe "Account" inclua um método para verificar o saldo mínimo exigido.
		
		// Escreva um programa em Java onde a classe "Account" implemente um método de cálculo de juros.
		
		// Escreva um programa em Java onde a classe "Account" registre o histórico de transações.
			// definir duas variaveis de contagem saque e deposito

	}

}
