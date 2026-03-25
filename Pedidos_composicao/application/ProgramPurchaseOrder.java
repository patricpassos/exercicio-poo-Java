package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.enums.OrderStatus;

public class ProgramPurchaseOrder {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***Enter client data***");
		System.out.print("Name: ");
		sc.next();
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate customerBirth = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Client client = new Client(name, email, customerBirth);
		
		System.out.println("\n***Enter order data***");
		LocalDateTime moment = LocalDateTime.now();
		System.out.print("Status: ");
		OrderStatus teste = OrderStatus.valueOf(sc.next());
		
		
		Order order = new Order(moment, teste, client);
		
		System.out.println(order);
		
		sc.close();

	}

}
