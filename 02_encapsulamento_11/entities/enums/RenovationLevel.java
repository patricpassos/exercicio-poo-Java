package entities.enums;

public enum RenovationLevel {

	SIMPLE(500.0, 1500.0),
    INTERMEDIATE(1500.01, 3000.0),
    COMPLETE(3000.01, Double.MAX_VALUE);

    private final double minPricePerSqm;
    private final double maxPricePerSqm;

    RenovationLevel(double minPricePerSqm, double maxPricePerSqm) {
        this.minPricePerSqm = minPricePerSqm;
        this.maxPricePerSqm = maxPricePerSqm;
    }

    // O próprio Enum valida a regra de negócio (Fail-Fast)!
    public void validatePrice(double pricePerSqm) {
        if (pricePerSqm < minPricePerSqm || pricePerSqm > maxPricePerSqm) {
            throw new IllegalArgumentException(
                String.format("Price R$ %.2f/m² is out of range for %s renovation.", pricePerSqm, this.name())
            );
        }
    }

    public static RenovationLevel fromString(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Renovation level cannot be null or empty.");
        }
        try {
            return RenovationLevel.valueOf(value.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid renovation level: " + value);
        }
    }
}
