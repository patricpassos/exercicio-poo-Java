package entities.enums;

public enum RoomCategory {

	SOCIAL(1.0),
	PRIVATE(1.0),
	SERVICE(1.25),
	OUTDOOR(1.10);
	
	private final double costFactor;

	RoomCategory(double costFactor) {
		this.costFactor = costFactor;
	}
	
	public double getCostFactor() {
        return costFactor;
    }
	
	public static RoomCategory fromString(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Room category cannot be null or empty.");
        }
        try {
            return RoomCategory.valueOf(value.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid room category: " + value);
        }
    }
}
