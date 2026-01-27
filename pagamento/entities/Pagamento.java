package entities;

public class Pagamento {
	
	public String nome;
	public double precoHora;
	public int horasTrabalhadas;
	
	public double pagamentoSalarial() {
		return precoHora * horasTrabalhadas;
	}
	
	public String toString() {
		return "O pagamento para "
				+ nome
				+ " deve ser "
				+ String.format("%.2f", pagamentoSalarial());
	}

}
