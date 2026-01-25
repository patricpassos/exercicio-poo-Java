package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramCambio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dolar? ");
		double precoAtualDolar = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
		double compraDolares = sc.nextDouble();
		
		double total = CurrencyConverter.totalGeral(precoAtualDolar, compraDolares);
		System.out.printf("Valor a ser pago em reais = %.2f", total);
		
		sc.close();

	}

}
