package entities;

import entities.enums.ResidentialHouses;

public class House {

	private Address address;
	private ResidentialHouses typeHouse;
	private double builtArea;
	
	public House(Address address, String typeHouse, double builtArea) {
		this.address = address;
		this.typeHouse = ResidentialHouses.fromString(typeHouse);
		this.builtArea = validatebuiltArea(builtArea);
	}
	
	public Address getAddress() {
		return address;
	}

	public String getTypeHouse() {
		return typeHouse.name().toLowerCase().replace("_", " ");
	}
	
	public double getBuiltArea() {
		return builtArea;
	}

	public double calculatePrice(double priceSquareMeter) {
		if(priceSquareMeter <= 0.0) {
			throw new IllegalArgumentException("Price incorrect.");
		}
		return this.builtArea * priceSquareMeter;
	}

	//fail-fast
	public static String valueStr(String valueStr) {
		if(valueStr == null || valueStr.isBlank()) {
			throw new IllegalArgumentException("Address incorrect.");
		}
		return valueStr;
	}
	
	public static int numberRooms (int numberOfRooms) {
		if(numberOfRooms <= 0) {
			throw new IllegalArgumentException("The number of rooms dont cannot be negative.");
		}
		return numberOfRooms;
	}
	
	public static double validatebuiltArea(double builtArea) {
		if(builtArea <= 0) {
			throw new IllegalArgumentException("The square area of ​​the property cannot be negative.");
		}
		return builtArea;
	}
	
	@Override
	public String toString() {
		return
				"Residential address" + "\n" + 
				getAddress().toString() + "\n" +
				"Type house: " + getTypeHouse() + "\n" + 
				String.format("Total built area: %.2f m²", getBuiltArea());
				
	}
}
