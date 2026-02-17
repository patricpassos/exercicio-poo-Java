package entities;

public class Pessoas {

	private double altura;
	private char genero;
	
	public Pessoas(double altura, char genero) {
		this.altura = altura;
		this.genero = genero;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public static int contagemMasculino(Pessoas[] vetor) {
		int contMasculino = 0;
		for(Pessoas c : vetor) {
			if(c.getGenero() == 'm' || c.getGenero() == 'M') {
				contMasculino++;
			}
		}
		
		return contMasculino;
	}
	
	public static double mediaAlturaFeminino(Pessoas[] vetor) {
		double soma = 0.0;
		int contFeminino = 0;
		for(Pessoas m : vetor) {
			if(m.getGenero() == 'f' || m.getGenero() == 'F') {
				soma += m.getAltura();
				contFeminino++;
			}
		}
		
		return soma == 0.0 ? 0.0 : (double) soma / contFeminino;
	}
	
	public static Pessoas menorAltura(Pessoas[] vetor) {
		Pessoas menor = vetor[0];
		
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i].getAltura() < menor.getAltura()) {
				menor = vetor[i];
			}
		}
		
		return menor;
	}
	
	public static Pessoas maiorAltura(Pessoas[] vetor) {
		Pessoas maior = vetor[0];
		
		for(int i = 1; i < vetor.length; i++) {
			if(vetor[i].getAltura() > maior.getAltura()) {
				maior = vetor[i];
			}
		}
		
		return maior;
	}
	
}
