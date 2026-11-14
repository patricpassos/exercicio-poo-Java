package entities.enums;

public enum OperatingSystem {

	WINDOWS, MACOS, LINUX;
	
	public static OperatingSystem fromString(String operatingSystem) {
		if(operatingSystem == null || operatingSystem.isBlank()) {
			throw new IllegalArgumentException("Operating system incorrect");
		}
		
		for(OperatingSystem os : OperatingSystem.values()) {
			if(os.name().equalsIgnoreCase(operatingSystem.trim())) {
				return os;
			}
		}
		throw new IllegalArgumentException("The operating system " + operatingSystem + " does not exist.");
	}
	
}
