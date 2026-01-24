package entities;

public class Student {

	public String nome;
	public double notaPrimeiroTrimestre;
	public double notaSegundoTrimestre;
	public double notaTerceiroTrimestre;

	public double notaFinal() {
		return notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
	}

	public double notaFaltante() {
		return 60.0 - notaFinal();
	}

}
