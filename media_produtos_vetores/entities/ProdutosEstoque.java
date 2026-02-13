package entities;

public class ProdutosEstoque {

	private String nome;
	private double preco;

	public ProdutosEstoque(String nome, double preco) {
		this.nome = nome;
		setPreco(preco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public static double mediaDePrecos(ProdutosEstoque[] vet) {
		
		double soma = 0.0;
		for(int i = 0; i < vet.length; i++) {
			soma = vet[i].getPreco();
		}
		
		return vet.length > 0 ? soma / vet.length : 0.0;
	}

}
