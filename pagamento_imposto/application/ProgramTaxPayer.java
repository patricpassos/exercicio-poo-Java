package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class ProgramTaxPayer {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> listTaxPay = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int quantityTaxPayer = sc.nextInt();
		
		for(int i = 0; i < quantityTaxPayer; i++) {
			System.out.printf("Tax payer #%d) data\n", i +1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual Income: ");
		}
		
		
		
		sc.close();

	}

}
