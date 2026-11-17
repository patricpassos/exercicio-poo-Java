package entities;

import entities.enums.RenovationLevel;
import entities.enums.RoomCategory;

public class Renovation {
	
	private static final double MIN_CONTINGENCY = 10.0;
    private static final double MAX_CONTINGENCY = 20.0;

	private String roomName;
	private double area;
	private double basePricePerSqm;
	private double contingencyRate;
    private RoomCategory category;
    private RenovationLevel level;
    
    public Renovation(String roomName, double area, double basePricePerSqm, double contingencyRate, String category, String level) {
		this.roomName = validateRoom(roomName);
		this.area = validateValue(area);
		this.contingencyRate = validateContingency(contingencyRate);
		this.category = RoomCategory.fromString(category);
		this.level = RenovationLevel.fromString(level);
		this.basePricePerSqm = this.level.validatePrice(basePricePerSqm);
    }
    
	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = validateRoom(roomName);
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = validateValue(area);
	}

	public double getBasePricePerSqm() {
		return basePricePerSqm;
	}

	public void setBasePricePerSqm(double basePricePerSqm) {
		this.basePricePerSqm = this.level.validatePrice(basePricePerSqm);
	}

	public double getContingencyRate() {
		return contingencyRate;
	}

	public void setContingencyRate(double contingencyRate) {
		this.contingencyRate = validateContingency(contingencyRate);
	}

	public RoomCategory getCategory() {
		return category;
	}

	public RenovationLevel getLevel() {
		return level;
	}
	
	public double calculateEstimatedRenovationCost() {
		double laborCosts = this.area * this.basePricePerSqm * this.category.getCostFactor();
		double contingencyReserve = 1.0 + (this.contingencyRate / 100.0);
		return laborCosts * contingencyReserve;
	}


	//fail-fast
	private static String validateRoom(String roomName) {
    	if(roomName == null || roomName.isBlank()) {
    		throw new IllegalArgumentException("Room name cannot be empty.");
    	}
    	return roomName.trim();
    }
    
    private static double validateValue(double area) {
    	if(area <= 0.0) {
    		throw new IllegalArgumentException("Area must be greater than zero.");
    	}
    	return area;
    }
    
    private static double validateContingency(double valueContingency) {
    	if(valueContingency < MIN_CONTINGENCY || valueContingency > MAX_CONTINGENCY) {
    		throw new IllegalArgumentException("Contingency rate must be between 10% and 20%.");
    	}
    	return valueContingency;
    }
    
    @Override
    public String toString() {
    	return
    			"Renovation Area" + "\n" +
    			"Room Name: " + getRoomName() + "\n" +
    			"Room category: " + category.name().toLowerCase() + "\n" +
    			"Renovation type: " + level.name().toLowerCase() + "\n" +
    			String.format("Renovation area: %.2f%n", getArea()) + 
    			String.format("Base Price Per Sqm: %.2f%n", getBasePricePerSqm()) +
    			String.format("Contingency Rate: %.1f%%%n", getContingencyRate()) + 
    			String.format("Estimated cost of the renovation: %.2f", calculateEstimatedRenovationCost());
    }
}
