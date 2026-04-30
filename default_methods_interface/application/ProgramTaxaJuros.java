package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class ProgramTaxaJuros {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService bis = new BrazilInterestService(2.0); //intanciação da taxa de juros do brazil com a interestRate
		double payment = bis.payment(amount, months); // chamada do metodo payment
		
		System.out.println("Payment after " + months + " months");
		System.out.println(String.format("%.2f", payment));
		
		System.out.print("\nAmount: ");
		double amountUsa = sc.nextDouble();
		System.out.print("Months: ");
		int monthsUsa = sc.nextInt();
		
		InterestService uis = new UsaInterestService(1.0);
		double paymentUsa = uis.payment(amountUsa, monthsUsa); 
		
		System.out.println("Payment after " + monthsUsa + " months");
		System.out.println(String.format("%.2f", paymentUsa));
			
		sc.close();

	}

}
