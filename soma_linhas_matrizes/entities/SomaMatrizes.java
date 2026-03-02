package entities;

public class SomaMatrizes {

	private int m;
	private int n;
	private double[][] dados;

	public SomaMatrizes(int linha, int coluna) {
		this.m = linha;
		this.n = coluna;
		this.dados = new double[linha][coluna];
	}

	public int getLinha() {
		return m;
	}

	public int getColuna() {
		return n;
	}

	public void setElementos(int linha, int coluna, double elemento) {
		dados[linha][coluna] = elemento;
	}

	public double[] somaLinha() {
		double[] soma = new double[dados.length];
		for (int i = 0; i < dados.length; i++) {
			double somatorio = 0.0;
			for (int j = 0; j < dados[i].length; j++) {
				somatorio += dados[i][j];
			}
			soma[i] = somatorio;
		}
		return soma;
	}

}
