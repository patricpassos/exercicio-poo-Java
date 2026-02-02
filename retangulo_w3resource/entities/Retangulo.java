package entities;

public class Retangulo {

	private double comprimento;
	private double largura;

	public Retangulo(double comprimento, double largura) {
		setComprimento(comprimento);
		setLargura(largura);
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		if (comprimento < 0.0) {
			this.comprimento = comprimento * -1.0;
		} else {
			this.comprimento = comprimento;
		}
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if (largura < 0.0) {
			this.largura = largura * -1.0;
		} else {
			this.largura = largura;
		}
	}

	public String quadrado() {
		if (comprimento == largura) {
			return "Quadrado";
		} else {
			return "Retangulo";
		}
	}

	public double diagonal() {
		double d = Math.pow(comprimento, 2) + Math.pow(largura, 2);
		return Math.sqrt(d);
	}

}
