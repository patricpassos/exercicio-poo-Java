package entities;

public class Lucro {
	
	private String nome;
	private double precoCompra;
	private double precoVenda;
	
	public Lucro(String nome, double precoCompra, double precoVenda) {
		this.nome = nome;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPrecoCompra() {
		return precoCompra;
	}
	
	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}
	
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public double lucroBruto() {
		return (precoVenda - precoCompra) / precoCompra * 100;
	}
	
	public boolean statusLucro10() {
		return lucroBruto() < 10; 
	}
	
	public boolean statusLucro10_20() {
		double lucro = lucroBruto();
		return lucro >= 10.0 && lucro <=20.0; 
	}
	
	public boolean statusLucro20() {
		return lucroBruto() > 20; 
	}
	
	public static double totalCompra(Lucro[] vetor) {
		double totalC = 0.0;
		for(Lucro lt : vetor) {
			totalC += lt.getPrecoCompra();
		}
		return totalC;
	}
	
	public static double totalVenda(Lucro[] vetor) {
		double totalV = 0.0;
		for(Lucro vt : vetor) {
			totalV += vt.getPrecoVenda();
		}
		return totalV;
	}
	
	public static double totalLucro(Lucro[] vetor) {
		return totalVenda(vetor) - totalCompra(vetor);
	}

}
