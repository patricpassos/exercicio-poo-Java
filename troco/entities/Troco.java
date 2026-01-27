package entities;

public class Troco {
	
	public double precoUnitario;
	public int quantidadeComprada;
	public double dinheiroRecebido;
	
	public double trocoCompra() {
		double totalCompra = precoUnitario * quantidadeComprada;
		return dinheiroRecebido - totalCompra;
	}
	
	public String toString() {
		return "TROCO = "
				+ String.format("%.2f", trocoCompra());
	}

}
