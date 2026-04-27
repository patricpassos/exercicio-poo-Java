package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;

public class ProgramPaymentSystem {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter the contract details:");
		System.out.print("Number: ");
		Integer numberContract = sc.nextInt();
		System.out.print("Date (dd/mm/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Contract value: ");
		Double value = sc.nextDouble();
		
		Contract ct = new Contract(numberContract, date, value);
		
		//System.out.print("Enter the number of installments: ");
		//Integer dueDate = sc.nextInt();
		
		
		
		
		
		sc.close();

	}

}
