package entities;

public class NumberArray {

	private final int[] numbers;

	public NumberArray(int[] numbers) {
		this.numbers = validateNumber(numbers);
	}
	
	public int countOccurrences(int target) {
		int count = 0;
		for (int n : numbers) {
			if (n == target) {
				count++;
			}
		}
		return count;
	}
	
	public int[] findIndices(int target) {
        int count = countOccurrences(target);
        int[] indices = new int[count];

        int position = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                indices[position] = i;
                position++;
            }
        }
        return indices;
	}
	
	private static int[] validateNumber(int[] numbers) {
		if(numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Numbers array cannot be empty.");
		}
		return numbers;
	}
	
	
}
