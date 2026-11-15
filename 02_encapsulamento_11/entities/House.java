package entities;

import entities.enums.ResidentialHouses;

public class House {

	private String address;
	private int latitude;
	private int longitude;
	private ResidentialHouses typeHouse;
	private String livingSpaces;
	private int numberOfRooms;
	private double area;
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public double calculatePrice(double priceSquareMeter) {
		return this.area * priceSquareMeter;
	}

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
	
	public static double area(double area) {
		if(area <= 0) {
			throw new IllegalArgumentException("The square area of ​​the property cannot be negative.");
		}
		return area;
	}
	
	@Override
	public String toString() {
		return
				"Address: " + getAddress() + "\n" +
				"Number of rooms: " + getNumberOfRooms() + "\n" + 
				String.format("Area: %.2f", getArea());
	}
}
