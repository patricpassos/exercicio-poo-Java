package application;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entities.BankAccount;

public class Account {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Random random = new Random();

		System.out.print("Holder name: ");
		String holder = sc.nextLine();

		System.out.println("SA - salary account");
		System.out.println("AV - savings account");
		System.out.println("AI - investment account");
		System.out.print("Type Account: ");
		String typeAccount = sc.next();

		int numberAccount = random.nextInt(1000);
		System.out.println("Account number: " + numberAccount);

		BankAccount account = new BankAccount(holder, typeAccount, numberAccount);

		account.statusAccount();

		System.out.print("Deposit: ");
		double initialDeposit = sc.nextDouble();
		account.deposit(initialDeposit);
		System.out.println("Salto conta: " + account.getBalance());

		System.out.print("Saque: ");
		double saque = sc.nextDouble();
		account.sacar(saque);
		System.out.println("Saldo: " + account.getBalance());

		sc.close();

	}

}
