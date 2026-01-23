package entities;

public class Product {
	//definição dos atributos
	public String name;
	public double price;
	public int quantity;
	
	//Criação dos metodos
	public double totalValueInStock() {
		return price * quantity;
	}
	
	//(this.nome do atributo) é uma palavra reservada para se referi ao atributo em vez do parametro
	public void addProducts(int quantity) {
		this.quantity += quantity; 
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}

}
