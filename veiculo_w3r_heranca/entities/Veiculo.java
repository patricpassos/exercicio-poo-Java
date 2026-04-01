package entities;

public class Veiculo {

	protected Double velocidade;

	public Veiculo() {
	}
	
	public Veiculo(Double velocidade) {
		this.velocidade = velocidade;
	}

	public Double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void verificarStatusDoMotor() {
		System.out.println("Status do veiculo: perfeitas condições");
	}
}
