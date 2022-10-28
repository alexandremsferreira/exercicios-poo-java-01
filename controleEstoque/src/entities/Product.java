package entities;

public class Product {
	public String name;
	public Double price; 
	public int quantity; 
	
	public double totalValueStock() {
		return this.quantity * this.price;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public void out() {
		System.out.printf("\nRelatório: Protudo %s, $%.3f Reais, %d unidades disponíveis",  
				name,
				price,
				quantity,
				totalValueStock()
		);
	}
	
}
