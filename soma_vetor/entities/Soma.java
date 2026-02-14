package entities;

public class Soma {

	private double numero;

	public Soma(double numero) {
		this.numero = numero;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public static void valores(Soma[] vetor) {
		for (Soma n : vetor) {
			System.out.print(n.getNumero() + " ");
		}
	}

	public static double somaVetores(Soma[] vetor) {
		double soma = 0.0;
		for (Soma s : vetor) {
			soma += s.getNumero();
		}
		return soma;
	}

	public static double mediaVetores(Soma[] vetor) {
		return somaVetores(vetor) / vetor.length;
	}

}
