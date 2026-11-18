package entities.enums;

public enum PropertyFeature {

	GOURMET_AREA(7.0),
	CUSTOM_FURNITURE(4.0),
	SECURITY(5.0),
	SPLIT_CENTRAL(6.0),
	PARKING_SPACE(9.0),
	STRUCTURAL_REFORM(7.0),
	LANDSCAPING(3.0),
	LUXURY_FINISHES(7.0);
	
	private final double appreciationRate;
	
	PropertyFeature(double appreciationRate) {
		this.appreciationRate = appreciationRate;
	}
	
	public double getAppreciationRate() {
		return appreciationRate;
	}

	public static PropertyFeature fromString(String value) {
		if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Property feature cannot be null or empty.");
        }
		try {
			return PropertyFeature.valueOf(value.trim().toUpperCase());
		} catch(IllegalArgumentException e) {
			throw new IllegalArgumentException("Invalid property feature.");
		}
	}
	
}
