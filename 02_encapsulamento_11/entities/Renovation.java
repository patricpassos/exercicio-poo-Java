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
		this.basePricePerSqm = this.level.validatePrice();
		this.contingencyRate = validateContingency(contingencyRate);
		this.category = RoomCategory.fromString(category);
		this.level = RenovationLevel.fromString(level);
	}

	//fail-fast
    public static String validateRoom(String roomName) {
    	if(roomName == null || roomName.isBlank()) {
    		throw new IllegalArgumentException("Room name cannot be empty.");
    	}
    	return roomName.trim();
    }
    
    public static double validateValue(double area) {
    	if(area <= 0.0) {
    		throw new IllegalArgumentException("Area must be greater than zero.");
    	}
    	return area;
    }
    
    public static double validateContingency(double valueContingency) {
    	if(valueContingency < MIN_CONTINGENCY || valueContingency > MAX_CONTINGENCY) {
    		throw new IllegalArgumentException("Contingency rate must be between 10% and 20%.");
    	}
    	return valueContingency;
    }
}
