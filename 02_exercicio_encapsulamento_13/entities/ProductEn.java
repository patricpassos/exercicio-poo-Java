package entities;

import entities.enums.ProductCategory;

public class ProductEn {

	private String name;
	private String code;
	private double price;
	private int quantity;
	private ProductCategory category;
	
	public ProductEn(String name, String code, double price, int quantity, ProductCategory category) {
		this.name = valitadeStr(name);
		this.code = valitadeStr(code);
		this.price = validatePrice(price);
		this.quantity = validateQuantity(quantity);
		this.category = category;
	}

	public void setName(String name) {
		this.name = valitadeStr(name);
	}

	public void setCode(String code) {
		this.code = valitadeStr(code);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = validatePrice(price);
	}

	public void setQuantity(int quantity) {
		this.quantity = validateQuantity(quantity);
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public void applyDiscount(double percentage) {
		if(percentage < 0.0 || percentage > 80.0) {
			throw new IllegalArgumentException("Percentage incorrect.");
		}
		this.price -= this.price * (percentage / 100.0);
	}
	
	public double calculateVolumeDiscount() {
		double totalPrice = this.price * this.quantity;
		if(this.quantity >= 10.0) {
			totalPrice -= totalPrice * 0.15; 
		} else if (this.quantity >= 5.0) {
			totalPrice -= totalPrice * 0.1; 
		} else if(this.quantity >= 3.0) {
			totalPrice -= totalPrice * 0.05; 
		}
		return totalPrice;
	}
	
	//fail-fast
	private static String valitadeStr(String valueStr) {
		if(valueStr == null || valueStr.isBlank()) {
			throw new IllegalArgumentException("Value Incorrect.");
		}
		return valueStr.trim();
	}
	
	private static double validatePrice(double price) {
		if(price <= 0.0) {
			throw new IllegalArgumentException("The price cannot be negative.");
		}
		return price;
	}
	
	private static int validateQuantity(int quantity) {
		if(quantity <= 0) {
			throw new IllegalArgumentException("The quantity product cannot be negative or zero.");
		}
		return quantity;
	}
	
	@Override
	public String toString() {
		return
				"Name product: " + name + "\n" +
				"Code product: " + code + "\n" + 
				"Category product: " + category.name().toLowerCase() + "\n" + 
				String.format("Price product: %.2f%n", price) + 
				String.format("Total to pay: %.2f%n", calculateVolumeDiscount());
	}
	
}
