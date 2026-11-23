package entities;

public class NumberArray {

	private final int[] numbers;

	public NumberArray(int[] numbers) {
		this.numbers = numbers;
	}
	
	private static int[] validateNumber(int[] numbers) {
		if(numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("\"Numbers array cannot be empty.");
		}
		return numbers;
	}
	
	
}
