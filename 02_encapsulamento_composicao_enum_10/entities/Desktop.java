package entities;

import entities.enums.OperatingSystem;
import entities.enums.ProcessorModel;

public class Desktop {
	
	private static final int MIN_RAMSIZE = 4; 
	private static final int MAX_RAMSIZE = 258;
	
	private String brand;
	private ProcessorModel processor;
	private OperatingSystem operatingSystem;
	private int ramSize;
	private int architecture;
	private double powerConsumption;

	public Desktop(String brand, String processor, String operatingSystem, int ramSize, int architecture, double powerConsumption) {
		this.brand = validateValue(brand);
		this.processor = ProcessorModel.fromString(processor);
		this.operatingSystem = OperatingSystem.fromString(operatingSystem);
		this.ramSize = validateRamSize(ramSize);
		this.architecture = validateArchitecture(architecture);
		this.powerConsumption = validatePowerConsumption(powerConsumption);
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
		return processor.name().toLowerCase().replace("_", " ");
	}
	
	public int getRamSize() {
		return ramSize;
	}
	
	public double estimateEnergyConsumption(double hoursUsed, int days) {
		if (hoursUsed < 0 || hoursUsed > 24) {
            throw new IllegalArgumentException("Hours used per day must be between 0 and 24.");
        }
        if (days <= 0) {
            throw new IllegalArgumentException("Days must be greater than zero.");
        }
        double totalHours = hoursUsed * days;
        return (this.powerConsumption * totalHours) / 1000.0;
	}
	
	public void upgradeProcessor(String newProcessor) {
		this.processor = ProcessorModel.fromString(newProcessor);
	}
	
	public void upgradeRam(int ramSize) {
		int validRamSize = validateRamSize(ramSize);
		int totalRamSize = this.ramSize + validRamSize;
		if(totalRamSize > MAX_RAMSIZE) {
			throw new IllegalArgumentException("maximum RAM memory limit.");
		}
		this.ramSize = totalRamSize;
	}
	
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = OperatingSystem.fromString(operatingSystem);
	}
	
	//dependência de uso temporario (USA UM)
	public boolean isCompatible(Software software) {
		boolean compatibility = true;
		
		if(software == null) {
			throw new IllegalArgumentException("Value incorrect.");
		}
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
		if(ramSize < MIN_RAMSIZE || ramSize > MAX_RAMSIZE) {
			throw new IllegalArgumentException("RAM size must be between " + MIN_RAMSIZE + "GB and " + MAX_RAMSIZE + "GB.");
		}
		return ramSize;
	}
	
	public static int validateArchitecture(int architecture) {
		if(architecture != 32 && architecture != 64) {
			throw new IllegalArgumentException("Incorrect bits.");
		}
		return architecture;
	}
	
	public static double validatePowerConsumption(double powerConsumption) {
		if(powerConsumption <= 0.0) {
			throw new IllegalArgumentException("Power consumption must be greater than zero.");
		}
		return powerConsumption;
	}
	
	@Override
	public String toString() {
		return 
				"Brand: " + getBrand() + "\n" +
				"Processor: " + getProcessor() + "\n" + 
				"Operating System: " + getOperatingSystem() + "\n" +
				String.format("Architecture: %d Bits%n", getArchitecture()) +
				String.format("RAM size: %d GB%n", getRamSize());
	}
	
}
