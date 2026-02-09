package entities;

public class Livro {
	
	private String titulo;
	private String autor;
	private double preco;
	private int vendas;
	private int estrelas;
	private int resenhas;
	
	public Livro() {
		this.titulo = "não definido";
		this.autor = "não definido";
		this.preco = 0.0;
		this.vendas = 0;
		this.estrelas = 0;
		this.resenhas = 0;
	}
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public Livro(String titulo, String autor, double preco, int vendas) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.vendas = vendas;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}
	
	public String getPreco() {
		return String.format("%.2f", preco);
	}
	
	public int getVendas() {
		return vendas;
	}
	
	public boolean isbestSeller() {
		return vendas >= 10000; 
	}
	
	public void percentualDeDesconto(double percentual) {
		double divisaoPercentual = percentual / 100;
		
		if (divisaoPercentual < 0.0 || divisaoPercentual >= 1.0) {
			System.out.println("Desconto inválido");
		}
		
		double valorDesconto = preco * divisaoPercentual;
		this.preco = preco - valorDesconto;
	}
	
	public void comparacaoLivros(Livro b, Livro c, Livro d) {
		double maiorPreco = b.preco;
		if(b.preco > c.preco && b.preco > d.preco) {
			maiorPreco = b.preco;
		} else if (c.preco > b.preco && c.preco > d.preco) {
			maiorPreco = c.preco;
		} else {
			maiorPreco = d.preco;
		}
		
		System.out.printf("\nO Livro mais caro e o %.2f", maiorPreco);
	}
	
	public void adicionarResenha(int estrelas) {
		if (estrelas < 1 || estrelas > 5) {
			System.out.println("Inválido. Somente notas de 1 a 5");
		}
		this.estrelas += estrelas;
		resenhas++;
	}
	
	public double classificacao() {
		if (resenhas == 0.0) {
			return 0.0;
		}
		return (double) estrelas / resenhas;
	}
	

}
