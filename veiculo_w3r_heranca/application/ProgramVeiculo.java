package application;

import entities.CarroHe;
import entities.Veiculo;

public class ProgramVeiculo {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		CarroHe carro = new CarroHe(1.7, 12.0);
		
		veiculo.verificarStatusDoMotor();
		carro.verificarStatusDoMotor();
		carro.nivelDeCombustivel();
		System.out.println("Velocidade: " + carro.getVelocidade() + " km/h");
		double custoViagem = carro.calcularCustoViagem(100.0, 12.5);
		System.out.printf("Custo da viagem: %.2f", custoViagem);
		
		
		
	}

}
