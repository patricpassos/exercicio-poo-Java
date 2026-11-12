package entities;

import entities.enums.OperatingSystem;

public class Software {

	private String name;
	private OperatingSystem operatingSystem;
	private int ramSize; 
	private int architecture;   // 32 ou 64 bits

	public Software(String name, String operatingSystem, int ramSize, int architecture) {
		this.name = name;
		this.operatingSystem = OperatingSystem.fromString(operatingSystem);
		this.ramSize = validateRamSize(ramSize);
		this.architecture = validateArchitecture(architecture);
	}

	public String getName() {
		return name;
	}
	
	public String getOperatingSystem() {
		return operatingSystem.name().toLowerCase();
	}

	public int getRamSize() {
		return ramSize;
	}

	public int getArchitecture() {
		return architecture;
	}

	//fail-fast
	public static int validateRamSize(int ramSize) {
		if(ramSize < 8) {
			throw new IllegalArgumentException("RAM incorrect.");
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
				"Pragram name: " + getName() + "\n" +
				"Operating System: " + getOperatingSystem() + "\n" + 
				String.format("Minimum RAM required for the software: %dGB%n", getRamSize()) +
				String.format("System architecture: %d Bits%n", getArchitecture());
	}
	
}
