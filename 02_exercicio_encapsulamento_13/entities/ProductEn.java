package entities;

public class ProductEn {

	private String name;
	private String code;
	private double price;
	private int quantity;
	
	public ProductEn(String name, String code, double price, int quantity) {
		this.name = valitadeStr(name);
		this.code = valitadeStr(code);
		this.price = validatePrice(price);
		this.quantity = validateQuantity(quantity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = valitadeStr(name);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = valitadeStr(name);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = validatePrice(price);
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = validateQuantity(quantity);
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
		} else if(this.quantity >= 3) {
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
				"Code Product: " + code + "\n" + 
				String.format("Price product: %.2f%n", price) + 
				String.format("Total to pay: %.2f%n", calculateVolumeDiscount());
	}
	
}
