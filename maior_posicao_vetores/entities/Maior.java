package entities;

public class Maior {
	
	private double[] vet;

	public Maior(int n) {
		this.vet = new double[n];
	}
	

	public void addElemento(int index, double elemento) {
		vet[index] = elemento;
	}

	
	public double maiorValor() {
		double maior = 0.0;
		for(double m : vet) {
			if (m > maior) {
				maior = m;
			}
		}
		return maior;
	}
	
	public int posicaoVetor() {
		int posicao = 0;
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] > posicao) {
				posicao = i;
			}
		}
		return posicao;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nMAIOR VALOR = ").append(maiorValor());
		sb.append("\nPOSIÇÃO DO MAIOR VALOR = ").append(posicaoVetor());
		
		return sb.toString();
	}

}
