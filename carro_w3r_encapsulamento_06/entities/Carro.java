package entities;

public class Carro {

	private static final int ANO_INICIAL = 1886;
	private static final double PRECO_MEDIO_GASOLINA = 6.33;

	private String empresa;
	private String modelo;
	private int ano;
	private double quilometragem;

	public Carro(String empresa, String modelo, int ano, double quilometragem) {
		this.empresa = empresa;
		this.modelo = modelo;
		setAno(ano);
		setQuilometragem(quilometragem);
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano < ANO_INICIAL) {
			System.out.println("Ano do carro ERRADO");
		} else {
			this.ano = ano;
		}
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		if (quilometragem < 0.0) {
			System.out.println("Não pode quilometragem NEGATIVA");
		} else {
			this.quilometragem = quilometragem;
		}
	}

	public void atualizacaoQuilometros(double quilometrosRodados) {
		quilometragem += quilometrosRodados;
	}

	public double eficiencia(double quilometrosRodados, double litros) {
		if (litros <= 0.0) {
			return 0.0;
		} else {
			return quilometrosRodados / litros;
		}
	}

	public double custoPorKm(double quilometrosRodados, double litros) {
		double eficiencia = eficiencia(quilometrosRodados, litros);
		if(eficiencia == 0) {
			return 0.0;
		}else {
			return PRECO_MEDIO_GASOLINA / eficiencia;
		}	
	}

	public String status(double quilometrosRodados, double litros) {
		return 
				"\n**STATUS VEICULAR**" 
				+ "\nFabricante: " 
				+ empresa 
				+ "\nModelo: " 
				+ modelo 
				+ "\nAno: " 
				+ ano
				+ "\nEficiência: " + String.format("%.2f", eficiencia(quilometrosRodados, litros)) + " km/l"
				+ "\nCusto por km: " + String.format("%.2f", custoPorKm(quilometrosRodados, litros)) + " por km"
				+ "\nQuilometragem total: " + String.format("%.2f", quilometragem) + "km";
	}
}
