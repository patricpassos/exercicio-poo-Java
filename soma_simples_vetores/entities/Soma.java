package entities;

public class Soma {

	private double[] vet;

	public Soma(int tamnhoVetor) {
		this.vet = new double[tamnhoVetor];
	}
	
	public double tamanhoVetor() {
		return vet.length;
	}
	
	public double[] getVet() {
		return vet;
	}
	
	public void setElemento(int index, double elemento) {
		vet[index] = elemento;
	}
	
	public double soma() {
		double soma = 0.0;
		for(double s : vet) {
			soma += s;
		}
		return soma;
	}
	
	public double media() {
		return 
				soma() == 0.0 ? 0.0 : soma() / vet.length;
	}

}
