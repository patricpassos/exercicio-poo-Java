package entities;

public class ProductGe implements Comparable<ProductGe>{

	private String name;
	private Double price;
	
	public ProductGe(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

	@Override
	public int compareTo(ProductGe other) {
		return price.compareTo(other.getPrice());
	}

}
