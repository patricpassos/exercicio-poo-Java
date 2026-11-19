package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductCatalog {

	private final List<ProductEn> items = new ArrayList<>();
	
	public List<ProductEn> getItems() {
		return Collections.unmodifiableList(items);
	}
	
	public void addSale(ProductEn product) {
		if (product == null) {
			throw new IllegalArgumentException("Product cannot be null.");
		}
		items.add(product);
	}
	
	public double calculateTotalRevenue() {
		double total = 0.0;
		for (ProductEn item : items) {
			total += item.calculateVolumeDiscount();
		}
		return total;
	}
	
}
