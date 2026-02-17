package entities;

public class Alunos {

	private String nome;
	private double notaA;
	private double notaB;

	public Alunos(String nome, double notaA, double notaB) {
		this.nome = nome;
		this.notaA = notaA;
		this.notaB = notaB;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNotaA() {
		return notaA;
	}

	public void setNotaA(double notaA) {
		this.notaA = notaA;
	}

	public double getNotaB() {
		return notaB;
	}

	public void setNotaB(double notaB) {
		this.notaB = notaB;
	}
	
	public double media() {
		return (notaA + notaB) / 2.0;
	}
	
	public boolean aprovacao() {
		return media() >= 6.0;
	}
	
	public String nome() {
		return nome;
	}

}
