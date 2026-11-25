package entities;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MediaVetores {

	private final int[] vetor;

	public MediaVetores(int[] vetor) {
		this.vetor = validadorDeMedia(vetor);
	}

	public double calculoMedia() {
		int soma = 0;
		for (int s : vetor) {
			soma += s;
		}
		return (double) soma / vetor.length;
	}

	public void resultado() {
		double media = calculoMedia();
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.DOWN);
		System.out.println(df.format(media));
	}

	private static int[] validadorDeMedia(int[] vetor) {
		if (vetor == null || vetor.length == 0) {
			throw new IllegalArgumentException("Numbers array cannot be empty.");
		}
		return vetor;
	}
}
