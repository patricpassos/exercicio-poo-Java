package entities;

public class Gato {

	private String nome;
	private int idade;
	private String raca;
	private double peso;

	public Gato() {
		this.nome = "não definido";
		this.idade = 0;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}
	
	public double getPeso() {
		return peso;
	}

	public void raca(String raca) {
		this.raca = raca;
	}

	public void nome(String nome) {
		this.nome = nome;
	}
	
	public void peso(double peso) {
		this.peso = peso;
	}
	
	public void comparacaoIdades(Gato other) {
		if(this.idade == other.idade) {
			System.out.println("Possuem a mesma idade");
		}else if(this.idade > other.idade) {
			System.out.println("O gato A e mais VELHO que o gato B");
		}else {
			System.out.println("O gato B e mais VELHO que o gato A");
		}
	}

}
