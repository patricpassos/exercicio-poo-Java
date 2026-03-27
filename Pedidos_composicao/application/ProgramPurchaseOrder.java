package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.ProductOrder;
import entities.enums.OrderStatus;

public class ProgramPurchaseOrder {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("***Enter client data***");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate customerBirth = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		Client client = new Client(name, email, customerBirth);

		System.out.println("\n***Enter order data***");
		LocalDateTime moment = LocalDateTime.now();
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(moment, status, client);

		System.out.print("\nHow many items to this order? ");
		int quantityOrder = sc.nextInt();

		for (int i = 0; i < quantityOrder; i++) {
			sc.nextLine();
			System.out.printf("Enter #%d item data:\n", i + 1);
			System.out.print("Product name: ");
			String product = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();

			ProductOrder productSpecification = new ProductOrder(product, price);

			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();

			OrderItem paymentOrder = new OrderItem(quantity, price, productSpecification);
			order.addItem(paymentOrder);
		}

		System.out.println(order);

		sc.close();

	}

}
