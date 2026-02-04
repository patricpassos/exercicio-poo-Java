package entities;

public class Funcionario {

	private static final double SALARIO_MINIMO = 1621.0;

	private int id;
	private String nome;
	private double salario;

	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		setSalario(salario);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSalario() {
		return String.format("%.2f", salario);
	}

	public void setSalario(double salario) {
		if (salario < SALARIO_MINIMO) {
			this.salario = SALARIO_MINIMO;
		} else {
			this.salario = salario;
		}
	}

	public void aumentoSalarial(int aumentoPercentual) {
		double novoSalario = this.salario + (this.salario * aumentoPercentual / 100);
		this.salario = novoSalario;
	}

}
