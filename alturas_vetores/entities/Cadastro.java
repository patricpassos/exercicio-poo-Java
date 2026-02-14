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
			System.out.println("IDADE ERRADA");
		} else {
			this.altura = altura;
		}
	}

	public static double mediaAltura(Cadastro[] cadastro) {
		double soma = 0.0;
		for (Cadastro s : cadastro) {
			soma += s.getAltura();
		}
		return soma / cadastro.length;
	}

	public static double menorDeDezesseis(Cadastro[] cadastro) {
		double cont = 0.0;
		for (Cadastro i : cadastro) {
			if (i.getIdade() < 16) {
				cont++;
			}
		}
		return cont == 0.0 ? 0.0 : cont / cadastro.length * 100;
	}

	public static void nomes(Cadastro[] cadastro) {
		for (Cadastro n : cadastro) {
			if (n.getIdade() < 16) {
				System.out.println(n.getNome());
			}
		}
	}

}
