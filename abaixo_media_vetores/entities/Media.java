package entities;

public class Media {

	private double[] vet;

	public Media(int n) {
		this.vet = new double[n];
	}

	public void setElemento(int index, double elemento) {
		vet[index] = elemento;
	}

	public double mediaVetor() {
		double soma = 0.0;
		for (double m : vet) {
			soma += m;
		}
		return soma / vet.length;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		double media = mediaVetor();
		sb.append("\nMÉDIA DO VETOR = ").append(String.format("%.3f", mediaVetor())).append("\n");

		sb.append("ELEMENTOS ABAIXO DA MÉDIA:\n");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < media) {
				sb.append(vet[i]).append("\n");
			}
		}
		return sb.toString();
	}

}
