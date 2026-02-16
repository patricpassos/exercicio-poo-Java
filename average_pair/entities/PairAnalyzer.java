package entities;

public class PairAnalyzer {

	private int number;

	public PairAnalyzer(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static void averagePair(PairAnalyzer[] vector) {
		int sum = 0;
		int cont = 0;
		for (PairAnalyzer s : vector) {
			if (s.getNumber() % 2 == 0) {
				sum += s.getNumber();
				cont++;
			}
		}

		if (sum == 0) {
			System.out.println("NO NUMBER IS EVEN");
		} else {
			double average = (double) sum / cont;
			System.out.printf("AVERAGE OF THE PAIRS = %.1f", average);
		}
	}

}
