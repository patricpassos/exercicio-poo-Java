package application;

import java.util.Locale;

import entities.ProductEn;

public class ProgramProductEn {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try {
			ProductEn product01 = new ProductEn("Lep top ", "LT01233", 5500.00, 1);
			System.out.println(product01);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		try {
			ProductEn product02 = new ProductEn("keyboard", "KB00889", 85.0, 2);
			product02.applyDiscount(5);
			System.out.println(product02);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

	}

}
