package entities;

public class CampoMinado {

	private final int[] tabuleiro;

	public CampoMinado(int[] tabuleiro) {
		this.tabuleiro = validadorTabuleiro(tabuleiro);
	}

	public int[] totalDeMinas() {
		int[] vetorMinas = new int[tabuleiro.length];
		for (int i = 0; i < tabuleiro.length; i++) {
			int minas = tabuleiro[i];
			if (i > 0) {
				minas += tabuleiro[i - 1];
			}
			if (i < tabuleiro.length - 1) {
				minas += tabuleiro[i + 1];
			}
			vetorMinas[i] = minas;
		}
		return vetorMinas;
	}

	private static int[] validadorTabuleiro(int[] tabuleiro) {
		if (tabuleiro == null || tabuleiro.length == 0) {
			throw new IllegalArgumentException("Os valores do tabuleiro não pode vazil.");
		}
		return tabuleiro;
	}

}
