package entities;

import entities.enums.ResidentialHouses;

public class House {

	private Address address;
	private ResidentialHouses typeHouse;
	private double builtArea;
	private double landArea;
	private double builtPricePerSqm;
    private double landPricePerSqm;
	
	public House(Address address, String typeHouse, double builtArea, double landArea, double builtPricePerSqm, double landPricePerSqm) {
		this.address = address;
		this.typeHouse = ResidentialHouses.fromString(typeHouse);
		this.builtArea = validatePositive(builtArea);
		this.landArea = validatePositive(landArea);
		this.builtPricePerSqm = validatePositive(builtPricePerSqm);
		this.landPricePerSqm =validatePositive(landPricePerSqm);
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
	
	public double getLandArea() {
		return landArea;
	}
	
	public double getBuiltPricePerSqm() {
		return builtPricePerSqm;
	}

	public void setBuiltPricePerSqm(double builtPricePerSqm) {
		this.builtPricePerSqm = validatePositive(builtPricePerSqm);
	}

	public double getLandPricePerSqm() {
		return landPricePerSqm;
	}

	public void setLandPricePerSqm(double landPricePerSqm) {
		this.landPricePerSqm = validatePositive(landPricePerSqm);
	}

	public double calculatePriceBuiltArea() {
        return this.builtArea * this.builtPricePerSqm;
    }

    public double calculatePriceLandArea() {
        return this.landArea * this.landPricePerSqm;
    }
	
    public double totalPrice() {
        return calculatePriceBuiltArea() + calculatePriceLandArea();
    }

	//fail-fast
	private static String valueStr(String valueStr) {
		if(valueStr == null || valueStr.isBlank()) {
			throw new IllegalArgumentException("Address incorrect.");
		}
		return valueStr;
	}
	
	private static double validatePositive(double value) {
		if(value <= 0.0) {
			throw new IllegalArgumentException("The value cannot be negative.");
		}
		return value;
	}
	
	@Override
	public String toString() {
		return
				"Residential address" + "\n" + 
				getAddress().toString() + "\n" +
				"Type house: " + getTypeHouse() + "\n" + 
				String.format("Total built area .................: %.2f m²%n", getBuiltArea()) + 
				String.format("Total land area  .................: %.2f m²%n", getLandArea()) +
				String.format("Price build area .................: %.2f%n", calculatePriceBuiltArea()) + 
				String.format("Price land area  .................: %.2f%n", calculatePriceLandArea()) + 
				String.format("Total price area .................: %.2f", totalPrice());
				
	}
}
