package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class ProgramTaxPayer {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> listTaxPay = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int quantityTaxPayer = sc.nextInt();

		for (int i = 0; i < quantityTaxPayer; i++) {
			System.out.printf("Tax payer #%d data\n", i + 1);

			System.out.print("Individual or company (i/c)? ");
			char ic = sc.next().toLowerCase().charAt(0);
			while (ic != 'i' && ic != 'c') {
				System.out.print("Individual or company (i/c):");
				ic = sc.next().toLowerCase().charAt(0);
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();

			if (ic == 'i') {
				System.out.print("Health expenditures: ");
				double heathExpenditure = sc.nextDouble();
				listTaxPay.add(new Individual(name, anualIncome, heathExpenditure));
			} else if (ic == 'c') {
				System.out.print("Nmber of employees: ");
				int numberOfEmployee = sc.nextInt();
				listTaxPay.add(new Company(name, anualIncome, numberOfEmployee));
			}
		}

		System.out.println("\nTAXES PAID:");
		double totalTax = 0.0;
		for (TaxPayer tp : listTaxPay) {
			System.out.printf("%s: $ %.2f\n", tp.getName(), tp.tax());
			totalTax += tp.tax();
		}

		System.out.printf("\nTOTAL TAX: $ %.2f", totalTax);

		sc.close();

	}

}
