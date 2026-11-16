package entities;

public class Address {

	private String street;
	private String number;
	private double latitudeCoordinates;
	private double longitudeCoordinates;
	
	public Address(String street, String number, double latitudeCoordinates, double longitudeCoordinates) {
		this.street = validateAddress(street);
		this.number = validateAddress(number);
		this.latitudeCoordinates = latitudeCoordinates;
		this.longitudeCoordinates = longitudeCoordinates;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = validateAddress(street);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = validateAddress(number);
	}

	public double getLatitudeCoordinates() {
		return latitudeCoordinates;
	}

	public double getLongitudeCoordinates() {
		return longitudeCoordinates;
	}

	//fail-fast
	public static String validateAddress(String valueAddress) {
		if(valueAddress == null || valueAddress.isBlank()) {
			throw new IllegalArgumentException("Address incorrect.");
		}
		return valueAddress.trim();
	}
	
	@Override
	public String toString() {
		return
				"Street name: " + getStreet() + "\n" + 
				"House number: " + getNumber() + "\n" + 
				String.format("Latitude Coordinates: %.4f%nLongitude Coordinates: %.4f%n", getLatitudeCoordinates(), getLongitudeCoordinates());
	}
}
