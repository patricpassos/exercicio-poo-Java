package entities;

public class Estudante {
	
	private int id;
	private String nome;
	private double nota;
	private int quantidadeNotas;
	private int presenca;
	
	public Estudante() {
		this(0, "não definido"); // Encadeamento de contrutores
	}

	public Estudante(int id, String nome) {
		this.id = id;
		this.nome = nome;
		this.nota = 0.0;
		this.quantidadeNotas = 0;
		this.presenca = 0;
	}
	
	public String getNome() {
		return nome.toUpperCase();
	}
	
	public int getId() {
		return id;
	}
	
	public void somaNotas(double nota) {
		if (nota < 0.0 || nota > 10.0) {
			System.out.println("Nota inválida");
		}
		
		this.nota += nota;
		quantidadeNotas++;
	}
	
	public double media() {
		if(nota == 0) {
			return 0.0;
		} else {
			return (double) nota / quantidadeNotas;
		}
	}
	
	public void presencaEscolar(char presenca) {
		if (presenca == 's' || presenca == 'S') {
			this.presenca++;
		}
	}
	
	public double frequencia() {
		return presenca / 0.05;
	}
	
	public String status() {
		if (media() < 6.0) {
			return "Reprovado";
		} else {
			return "Aprovado";
		}
	}

}
