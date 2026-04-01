package entities;

public class CarroHe extends Veiculo {

	private Double nivelCombustivel;
	private Double consumoKmL;

	public CarroHe(Double nivelCombustivel, Double consumoKmL) {
		super(100.0);
		this.nivelCombustivel = nivelCombustivel;
		this.consumoKmL = consumoKmL;
	}

	public Double getNivelCombustivel() {
		return nivelCombustivel;
	}

	public void setNivelCombustivel(Double nivelCombustivel) {
		this.nivelCombustivel = nivelCombustivel;
	}

	public Double getConsumoKmL() {
		return consumoKmL;
	}

	public void setConsumoKmL(Double consumoKmL) {
		this.consumoKmL = consumoKmL;
	}

	@Override
	public void verificarStatusDoMotor() {
		System.out.println("Status do carro: Motor em condições de uso");
	}

	public void nivelDeCombustivel() {
		if (nivelCombustivel <= 2.0) {
			System.out.println("ALERTA: RESERVA!");
		} else {
			System.out.println("Nivel combustivel: " + nivelCombustivel + " Litros");
		}
	}

	public double calcularCustoViagem(Double distancia, Double precoCombustivel) {
		return (distancia / consumoKmL) * precoCombustivel;
	}
}
