package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.PropertyFeature;
import entities.enums.ResidentialHouses;

public class House {

	private Address address;
	private ResidentialHouses typeHouse;
	private double builtArea;
	private double landArea;
	private double builtPricePerSqm;
    private double landPricePerSqm;
    private List<PropertyFeature> features = new ArrayList<>();
	
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

	public ResidentialHouses getTypeHouse() {
		return typeHouse;
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
	
	public List<PropertyFeature> getFeatures() {
		return features;
	}

	//IMPORTANTE: PARA ADD VALORES DENTRO DE UM LISTA COM ENUMS
	public void addFeature(String feature) {
		PropertyFeature parsedFeature = PropertyFeature.fromString(feature);
		if(features.contains(parsedFeature)) {
			throw new IllegalArgumentException("Feature already added to this house: " + parsedFeature.name());
		}
		features.add(parsedFeature);
	}

	public double calculatePriceBuiltArea() {
        return this.builtArea * this.builtPricePerSqm;
    }

    public double calculatePriceLandArea() {
        return this.landArea * this.landPricePerSqm;
    }
	
    public double calculateBasePrice() {
		return calculatePriceBuiltArea() + calculatePriceLandArea();
	}

	public double totalPrice() {
		double basePrice = calculateBasePrice();
		return basePrice * (1.0 + calculateTotalAppreciationRate());
	}
    
    private double calculateTotalAppreciationRate() {
    	double sumFeature = 0.0;
    	for(PropertyFeature ft : features) {
    		sumFeature += ft.getAppreciationRate(); //getAppreciationRate() **esta no enum**
    	}
    	return sumFeature / 100.0;
    }

	//fail-fast
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
				"Type house: " + getTypeHouse().name().toLowerCase().replace("_", " ") + "\n" + 
				String.format("Total built area .................: %.2f m²%n", getBuiltArea()) + 
				String.format("Total land area  .................: %.2f m²%n", getLandArea()) +
				String.format("Price build area .................: %.2f%n", calculatePriceBuiltArea()) + 
				String.format("Base price       .................: %.2f%n", calculateBasePrice()) +
				String.format("Total price      .................: %.2f", totalPrice());
				
	}
}
