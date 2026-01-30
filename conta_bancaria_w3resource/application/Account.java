package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Account {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Account number: ");
		int number = sc.nextInt();
		System.out.print("Balance: ");
		double balance = sc.nextDouble();

		BankAccount account = new BankAccount(number, balance);

		System.out.print("\nAccount number: " + account.getAccountNumber());
		System.out.printf("\nBalance: %.2f", account.getBalance());

		sc.close();

	}

}
