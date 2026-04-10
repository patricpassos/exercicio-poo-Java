package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.AccountUser;
import model.exceptions.DomainException01;

public class ProgramBank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			AccountUser account = new AccountUser(number, holder, balance, withdrawLimit);
			
			System.out.print("\nEnter amount for withdraw: ");
			Double amount = sc.nextDouble();
			account.withdraw(amount);
			
			System.out.println("New balance: " + account.getBalance());
		}
		catch (RuntimeException e){
			System.out.println("Unexpected error");
		}
		catch(DomainException01 e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
