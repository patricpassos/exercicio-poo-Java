package entities;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		} else {
			this.idade = 0;
		}
	}

	public String faixaEtaria() {
		if (idade >= 65) {
			return "Idoso";
		} else if (idade >= 18) {
			return "Adulto";
		} else if (idade >= 13) {
			return "Adolescente";
		} else if (idade > 0) {
			return "Infantil";
		} else {
			return "--";
		}
	}

}
