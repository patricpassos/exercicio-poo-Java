package entities;

public class Maior {
	
	private double numero;

	public Maior(double numero) {
		this.numero = numero;
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}
	
	public static double maiorValor(Maior[] vetor) {
		double maior = 0.0;
		for(Maior m : vetor) {
			if (m.getNumero() > maior) {
				maior = m.getNumero();
			}
		}
		return maior;
	}
	
	public static int posicaoVetor(Maior[] vetor) {
		int posicao = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i].getNumero() > vetor[posicao].getNumero()) {
				posicao = i;
			}
		}
		return posicao;
	}

}
