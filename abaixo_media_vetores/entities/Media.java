package entities;

public class Media {

	private double elementos;

	public Media(double elementos) {
		this.elementos = elementos;
	}

	public double getElementos() {
		return elementos;
	}

	public void setElementos(double elementos) {
		this.elementos = elementos;
	}
	
	public static double mediaVetor(Media[] vetor) {
		double soma = 0.0;
		for(Media m : vetor) {
			soma += m.getElementos();
		}
		return soma / vetor.length;
	}
	
	public static void abaixoMedia(Media[] vetor) {
		double media = mediaVetor(vetor);
		
		for(Media a: vetor) {
			if (a.getElementos() < media) {
				System.out.println(a.getElementos());
			}
		}
	}
}
