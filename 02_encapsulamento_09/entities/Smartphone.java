package entities;

public class Smartphone {

	private static final int MAX_STORAGE = 512;
	
	private String brand;
	private String model;
	private int storageCapacity;
	private int battery;
	
	public Smartphone(String brand, String model, int storageCapacity, int battery) {
		this.brand = validateValue(brand);
		this.model = validateValue(model);
		this.storageCapacity = validateStorage(storageCapacity);
		this.battery = validateBattery(battery);
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}
	
	public int getBaterry() {
		return battery;
	}
	
	public void setBattery(int battery) {
		this.battery = validateBattery(battery);
	}

	public void increaseStorage(int additionalStorage) {
		if (additionalStorage <= 0) {
            throw new IllegalArgumentException("Additional storage must be greater than zero.");
        }
        
        int newTotalStorage = this.storageCapacity + additionalStorage;
        
        if (newTotalStorage > MAX_STORAGE) {
            throw new IllegalArgumentException("Exceeds the maximum storage limit of " + MAX_STORAGE + " GB.");
        }
        
        this.storageCapacity = newTotalStorage;
	}

	//fail-fast
	public static String validateValue(String value) {
		if(value == null || value.isBlank()) {
			throw new IllegalArgumentException("Value incorrect");
		}
		return value.trim();
	}
	
	public static int validateStorage(int storageCapacity) {
		if(storageCapacity <= 0) {
			throw new IllegalArgumentException("Storage capacity must be greater than zero.");
		}
		return storageCapacity;
	}
	
	public static int validateBattery(int battery) {
		if(battery < 0 || battery > 100) {
			throw new IllegalArgumentException("Battery percentage must be between 0 and 100.");
		}
		return battery;
	}

	@Override
	public String toString() {
		return
				"Brand: " + getBrand() + "\n" +
				"Model: " + getModel() + "\n" +
				String.format("Storage capacity: %d GB%n", getStorageCapacity()) + 
				String.format("Battery percentage %d%%%n", getBaterry());
	}
	
}
