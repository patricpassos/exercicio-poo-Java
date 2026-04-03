package entities;

import java.time.LocalDate;

public class UsedProducts extends Products{
	
	private LocalDate manufactureDate;
	
	public UsedProducts() {
		super();
	}

	public UsedProducts(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return
				name 
				+ " (used) "
				+ " $ " + price
				+ " (Manufacture date: " + manufactureDate + ")";
	}

}
