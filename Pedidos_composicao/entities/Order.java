package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		double totalPrice = 0.0;
		for (OrderItem oi : items) {
			totalPrice += oi.subTotal();
		}
		return totalPrice;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		sb.append("\nORDER SUMMARY");
		sb.append("\nOrder moment: ").append(moment.format(fmt));
		sb.append("\nOrder Status: ").append(status);
		sb.append("\nClient: ").append(client);
		sb.append("\nOrderItems:\n");

		for (OrderItem oi : items) {
			sb.append(oi).append("\n");
		}

		sb.append("\nTotal price: $").append(String.format("%.2f", total()));

		return sb.toString();
	}

}
