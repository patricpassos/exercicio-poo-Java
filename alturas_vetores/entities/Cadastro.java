package entities;

public class Cadastro {

	private String nome;
	private int idade;
	private double altura;

	public Cadastro(String nome, int idade, double altura) {
		this.nome = nome;
		setIdade(idade);
		setAltura(altura);
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
		if (idade < 0.0) {
			System.out.println("IDADE ERRADA");
		} else {
			this.idade = idade;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura < 0.0) {
			System.out.println("ALTURA ERRADA");
		} else {
			this.altura = altura;
		}
	}

}
