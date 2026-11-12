package entities;

import entities.enums.OperatingSystem;

public class Desktop {
	
	private static final int MAX_RAMSIZE = 258;
	
	private String brand;
	private String processor;
	private OperatingSystem operatingSystem;
	private int ramSize;
	private int architecture; // 32 / 64 bits
	private Software software;

	public Desktop(String brand, String processor, String operatingSystem, int ramSize, int architecture) {
		this.brand = brand;
		this.processor = processor;
		this.operatingSystem = OperatingSystem.fromString(operatingSystem);
		this.ramSize = validateRamSize(ramSize);
		this.architecture = validateArchitecture(architecture);
	}
	
	public String getOperatingSystem() {
		return operatingSystem.name().toLowerCase();
	}

	public int getArchitecture() {
		return architecture;
	}
	public String getBrand() {
		return brand;
	}
	
	public String getProcessor() {
		return processor;
	}
	
	public int getRamSize() {
		return ramSize;
	}
	
	public void setRamSize(int ramSize) {
		int validRamSize = validateRamSize(ramSize);
		int totalRamSize = this.ramSize + validRamSize;
		if(totalRamSize > MAX_RAMSIZE) {
			throw new IllegalArgumentException("maximum RAM memory limit.");
		}
		this.ramSize = totalRamSize;
	}
	
	public void setgetOperatingSystem(String operatingSystem) {
		this.operatingSystem = OperatingSystem.fromString(operatingSystem);
	}
	
	public boolean isCompatible(Software software) {
		boolean compatibility = true;
		if(this.ramSize < software.getRamSize()) {
			return false;
		}
		if(this.architecture < software.getArchitecture()) {
			compatibility = false;
		}
		if(!this.operatingSystem.name().equalsIgnoreCase(software.getOperatingSystem())) {
			compatibility = false;
		}
		return compatibility;
	}
	
	//fail-fast
	public static String validateValue(String value) {
		if(value == null || value.isBlank()) {
			throw new IllegalArgumentException("Value Incorrect.");
		}
		return value.trim();
	}
	
	public static int validateRamSize(int ramSize) {
		if(ramSize < 0 || ramSize > MAX_RAMSIZE) {
			throw new IllegalArgumentException("Ram size incorrect");
		}
		return ramSize;
	}
	
	public static int validateArchitecture(int architecture) {
		if(architecture != 32 && architecture != 64) {
			throw new IllegalArgumentException("Incorrect bits.");
		}
		return architecture;
	}
	
	@Override
	public String toString() {
		return 
				"Brand: " + getBrand() + "\n" +
				"Processor: " + getProcessor() + "\n" + 
				"Operating System: " + getOperatingSystem() + "\n" +
				String.format("Architecture: %d Bits%n", getArchitecture()) +
				String.format("RAM size: %dGB%n", getRamSize());
	}
	
}
