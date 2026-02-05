package entities;

public class Circulo {

	private static final double PI = 3.14;
	private double raio;

	public Circulo(double raio) {
		setRaio(raio);
	}

	public void setRaio(double raio) {
		if (raio < 0.0) {
			System.out.println("Não pode ter raio negativo");
		} else {
			this.raio = raio;
		}
	}

	public double area() {
		return PI * raio * raio;
	}

	public double perimetro() {
		return 2 * PI * raio;
	}

	public void raio(Circulo other) {
		if (raio == other.raio) {
			System.out.println("O primeiro raio CABE dentro do segundo");
		} else {
			System.out.println("O primeiro circulo NÃO cabe dentro do segundo");
		}
	}

}
