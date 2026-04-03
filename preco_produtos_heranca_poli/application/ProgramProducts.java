package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProducts;
import entities.Products;
import entities.UsedProducts;

public class ProgramProducts {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Products> listProducts = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int quantityProducts = sc.nextInt();
		
		for(int i = 0; i < quantityProducts; i++) {
			System.out.printf("Product #%d data:\n", i + 1);
			System.out.print("Common, used or imported (c/u/i): ");
			char productType = sc.next().toLowerCase().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(productType == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Products productUsed = new UsedProducts(name, price, manufactureDate);
				listProducts.add(productUsed);
			} else if (productType == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Products productsCustomsFee = new ImportedProducts(name, price, customsFee);
				listProducts.add(productsCustomsFee);
			} else {
				Products productsCommon = new Products(name, price);
				listProducts.add(productsCommon);
			}
		}
		
		System.out.println("\nPRICE TAGS:");
		
		
		sc.close();

	}

}
