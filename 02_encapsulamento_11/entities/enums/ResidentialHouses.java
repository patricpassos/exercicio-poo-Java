package entities.enums;

public enum ResidentialHouses {
	
	STANDALONE_HOUSE, CONDOMINIUM_HOUSE, TWO_STORY_HOUSE;
	
	public static ResidentialHouses validateTypeHouse(String typeHouse) {
		if(typeHouse == null || typeHouse.isBlank()) {
			throw new IllegalArgumentException("the wrong type of house.");
		}
		
		for(ResidentialHouses house : ResidentialHouses.values()) {
			if(house.name().equalsIgnoreCase(typeHouse.trim())) {
				return house;
			}
		}
		throw new IllegalArgumentException("The house " + typeHouse.replace("_", " ") + " does not exist.");
	}
	
}
