package entities;

public class Car {
	
	private String make;
	private String model;
	private int year;
	private double totalMileage;
	private double lastMaintenance;
	
	public Car(String make, String model, int year) {
		this.make = validateMake(make);
		this.model = validateModel(model);
		this.year = validateYear(year);
	}
	
	public boolean hasMaintenance() {
		return ((totalMileage - lastMaintenance) >= 500.0);
	}
	
	public void performMaintenance(double mileage) {
		if(mileage < lastMaintenance || mileage < 0.0) {
			throw new IllegalArgumentException("The maintenance mileage cannot be lower than the previous one.");
		}
		lastMaintenance = mileage;
	}
	
	public void addTrip(double distance) {
		if(distance <= 0.0) {
			throw new IllegalArgumentException("Incorrect mileage.");
		}
		totalMileage += distance;
	}
	
	public boolean isSameModel(Car otherCar) {
		if(otherCar == null) {
			return false;
		}
		return this.model.equalsIgnoreCase(otherCar.model);
	}
	
	public double calculateFuelEfficiency(double mileage, double litersConsumed) {
		if(mileage <= 0.0 || litersConsumed <= 0.0) {
			throw new IllegalArgumentException("Incorrect values");
		}
		return mileage / litersConsumed;
	}
	
	//fail-fast
	public static String validateMake(String make) {
		return switch(make) {
				case String m when (m == null || m.isEmpty()) -> throw new IllegalArgumentException("The car brand does not exist.");
				default -> make;
		};
	}
	
	public static String validateModel(String model) {
		return switch(model) {
				case String m when (m == null || m.isEmpty()) -> throw new IllegalArgumentException("The car model does not exist.");
				default -> model;
		};
	}
	
	public static int validateYear(int year) {
		return switch(Integer.valueOf(year)) {
				case Integer y when y <= 0 -> throw new IllegalArgumentException("Incorrect car year.");
				default -> year;
		};
	}
	
	@Override
	public String toString() {
		return "Car Details\n" +
			   "Brand: " + make + "\n" +
			   "Model: " + model + "\n" +
			   "Year: " + year + "\n" + 
			   String.format("Mileage: %.1f%n", totalMileage) + 
			   String.format("Alarm maintenance: %s%n", hasMaintenance() ? "Engine maintenance" : "OK") +
			   String.format("Next maintenance: %.2f%n", (lastMaintenance + 500));
				
	}

}
