package entities;

public class PredicateProdutos {

	private String nome;
	private Double preco;
	
	public PredicateProdutos(String nome, Double preco) {
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
	
	//Utilizando o reference method com método estático (Trabalha com o argumento passado)
	public static boolean staticProdutoPredicate(PredicateProdutos p) {
		return p.getPreco() >= 100.0;
	}
	
	//Utilizando o reference method com método não estático (metodo da intancia, trabalha com o proprio objeto)
	public boolean nonStaticProdutoPredicate() {
		return preco >= 100.0;
	}
	
	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", preco);
	}
}
