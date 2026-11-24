package entities;

public class LargerSmaller {

	private int[] numbers;

	public LargerSmaller(int[] numbers) {
		this.numbers = validateNumbers(numbers);
	}

	public int findLargest() {
		int largest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		return largest;
	}

	public int findSmallest() {
		int smaller = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < smaller) {
				smaller = numbers[i];
			}
		}
		return smaller;
	}

	private static int[] validateNumbers(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Numbers array cannot be empty.");
		}
		return numbers;
	}
}
