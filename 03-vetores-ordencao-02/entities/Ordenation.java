package entities;

import java.util.Arrays;

public class Ordenation {

	private final int[] numbers;

	public Ordenation(int[] numbers) {
		this.numbers = validateNumbers(numbers);
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void ascendingOrder() {
		Arrays.sort(numbers);
	}

	private static int[] validateNumbers(int[] numbers) {
		if(numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Numbers array cannot be empty.");
		}
		return numbers;
	}
	
}
