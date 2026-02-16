package entities;

public class Pair {

	private int number;

	public Pair(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static void averegePair(Pair[] vector) {
		int sum = 0;
		int cont = 0;
		for (Pair s : vector) {
			if (s.getNumber() % 2 == 0) {
				sum += s.getNumber();
				cont++;
			}
		}

		if (sum == 0) {
			System.out.println("NO NUMBER IS EVEN");
		} else {
			double averege = sum / cont;
			System.out.printf("AVERAGE OF THE PAIRS = %.1f", averege);
		}
	}

}
