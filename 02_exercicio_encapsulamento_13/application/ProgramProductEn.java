package application;

import java.util.Locale;

import entities.ProductCatalog;
import entities.ProductEn;
import entities.enums.ProductCategory;

public class ProgramProductEn {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		ProductCatalog order = new ProductCatalog();

		try {
			ProductEn product01 = new ProductEn("Lep top ", "LT01233", 5500.00, 1, ProductCategory.COMPUTERS);
			order.addSales(product01);
			System.out.println(product01);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

		try {
			ProductEn product02 = new ProductEn("keyboard", "KB00889", 85.0, 2, ProductCategory.PERIPHERALS);
			product02.applyDiscount(5);
			order.addSales(product02);
			System.out.println(product02);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		try {
			ProductEn product03 = new ProductEn("headset", "HDT1993", 120.0, 8, ProductCategory.PERIPHERALS);
			order.addSales(product03);
			System.out.println(product03);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("----------------------------------------------------");
		System.out.printf("Total Sales Revenue: $ %.2f%n", order.calculateTotalRevenue());
		
	}

}
