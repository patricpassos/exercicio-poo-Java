package entities;

public class ProdutosStream {

	private String nome;
	private Double preco;
	
	public ProdutosStream(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", preco);
	}
	
}
