package entities.enums;

public enum ProcessorModel {

	INTEL_I5, INTEL_I7, AMD_RYZEN_5, AMD_RYZEN_7;
	
	public static ProcessorModel fromString(String processor) {
		if(processor == null || processor.isBlank()) {
			throw new IllegalArgumentException("Processor incorrect");
		}
		for(ProcessorModel pm : ProcessorModel.values()) {
			if(pm.name().equalsIgnoreCase(processor.trim())) {
				return pm;
			}
		}
		throw new IllegalArgumentException("The processor " + processor.replace("_", " ") + " does not exist.");
	}
	
}
