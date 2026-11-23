package entities;

public class Ordenation {

	private final int[] numbers;

	public Ordenation(int[] numbers) {
		this.numbers = numbers;
	}
	
	private static int[] validateNumbers(int[] numbers) {
		if(numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Numbers array cannot be empty.");
		}
		return numbers;
	}
	
}
