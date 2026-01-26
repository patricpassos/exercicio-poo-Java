package entities;

public class Calculo {
	
	public double largura;
	public double comprimento;
	public double preco;
	
	public double areaDoTerreno() {
		return largura * comprimento;
	}
	
	public double precoTerreno() {
		return areaDoTerreno() * preco;
	}

}
