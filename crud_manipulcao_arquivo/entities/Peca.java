package entities;

public class Peca {
	
	private String marca;
	private String modalidade;
	private String serie;
	private Integer quantidade;
	private Double preco;
	
	public Peca() {
	}

	public Peca(String marca, String modalidade, String serie, Integer quantidade, Double preco) {
		this.marca = marca;
		this.modalidade = modalidade;
		this.serie = serie;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double total() {
		return quantidade * preco;
	}
	
	@Override
	public String toString() {
		return
				String.format("%-15s %-15s %-15s %-15d %-15.2f %-15.2f", marca, modalidade, serie, quantidade, preco, total());
	}
	
}
