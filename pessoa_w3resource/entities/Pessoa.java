package entities;

public class Pessoa {

	private String nome;
	private int idade;
	private String pais;

	public Pessoa(String nome, int idade, String pais) {
		this.nome = nome;
		this.idade = idade;
		this.pais = pais;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public void faixaEtaria (int idade) {
		if(idade >= 65) {
			System.out.println("Faixa etária: Idoso");
		}
		else if(idade >= 18) {
			System.out.println("Faixa etária: Adulto");
		}
		else if (idade >= 13) {
			System.out.println("Faixa etária: Adolescente");
		}
		else {
			System.out.println("Faixa etária: Infantil");
		}
	}

}
