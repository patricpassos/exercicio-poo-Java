package entities;


public class CarEn {

	private String company;
	private String model;
	private int year;
	private double mileage;
	private int speedometer;
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = validateYear(year);
	}
	
	public double getMileage() {
		return mileage;
	}
	
	public void drive(double mileage) {
		double mileageDriven = validateMileage(mileage);
		this.mileage += mileageDriven;
	}
	
	public int getSpeedometer() {
		return speedometer;
	}

	public void setSpeedometer(int speedometer) {
		int speed = validateSpeed(speedometer);
		this.speedometer = speed;
	}
	
	public double calculateFuelEfficiency(double tripMileage, double liters) {
		if (liters <= 0.0) {
			throw new IllegalArgumentException("Liters must be greater than zero.");
		}
		double validDistance = validateMileage(tripMileage);
		this.mileage += validDistance;
		return validDistance / liters;
	}
	
	public String driveModes() {
		return switch(Integer.valueOf(speedometer)) {
		case Integer s when s <= 60  -> "Eco drive";
		case Integer s when s <= 120 -> "Economy drive";
		case Integer s when s <= 160 -> "Moderate drive";
		case Integer s when s <= 200 -> "Sport drive";
		default -> "maximum speed limit reached";
		};
	}

	//fail-fast
	public static int validateSpeed(int speedometer) {
		if(speedometer < 0 || speedometer > 210) {
			throw new IllegalArgumentException("Incorrect speed");
		}
		return speedometer;
	}
	
	public static double validateMileage(double mileage) {
		if(mileage < 0.0) {
			throw new IllegalArgumentException("Icorrect mileage.");
		}
		return mileage;
	}
	
	public static int validateYear(int year) {
		if(year < 1886) {
			throw new IllegalArgumentException("Year incorrect.");
		}
		return year;
	}
	
	@Override
	public String toString() {
		return 
				"Company: " + getCompany() + "\n" +
				"Moldel: " + getModel() + "\n" +
				"Year: " + getYear() + "\n" +
				String.format("Mileage: %.2f%n", getMileage()) + 
				String.format("Conduction velocity: %d Km/h%n", getSpeedometer()) + 
				"Modes drive: " + driveModes();
	}
	
	
}
