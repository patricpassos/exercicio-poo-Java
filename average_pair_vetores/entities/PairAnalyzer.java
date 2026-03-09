package entities;

public class PairAnalyzer {

	private int[] vet;

	public PairAnalyzer(int n) {
		this.vet = new int[n];
	}

	public void setElement(int i, int element) {
		vet[i] = element;
	}

	public double averagePair() {
		int sum = 0;
		int cont = 0;
		for (int s : vet) {
			if (s % 2 == 0) {
				sum += s;
				cont++;
			}
		}
		return sum == 0 ? 0 : (double) sum / cont;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		double average = averagePair();
		if (average == 0.0) {
			sb.append("NO EVEN NUMBER");
		} else {
			sb.append("AVERAGE OF THE PAIRS: ").append(average);
		}

		return sb.toString();
	}
}
