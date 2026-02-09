package entities;

public class Estudante {
	
	private int id;
	private String nome;
	private double nota;
	
	public Estudante() {
		this(0, "não definido", 0.0); // Encadeamento de contrutores
	}

	public Estudante(int id, String nome, double nota) {
		this.id = id;
		this.nome = nome;
		this.nota = nota;
	}
	
	

}
