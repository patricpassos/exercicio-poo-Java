package entities;

public class Dog {

	private String name;
	private String color;
	private int barksCount;
	private boolean trained;
	private double weight;

	public Dog(String name, String color, boolean trained, double weight) {
		this.name = name;
		this.color = color;
		this.trained = trained;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getBarksCount() {
		return barksCount;
	}
	
	public void setTrained(boolean trained) {
		this.trained = trained;
	}

	public void bark() {
		barksCount++;
	}
	
	public boolean isTrained() {
		return trained;
	}
	
	public String largeBreed() {
		return switch(Double.valueOf(weight)) {
				case Double l when l <= 5.0 ->  "Mini/Toy";
				case Double l when l <= 15.0 -> "Pequeno";
				case Double l when l <= 25.0 -> "Medio";
				default -> "Grande";
			};
	}
	
	public void compareColors(Dog otherDog) {
		if (this.color.equalsIgnoreCase(otherDog.color)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}
