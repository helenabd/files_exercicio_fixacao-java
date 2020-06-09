package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getNome() {
		return this.name;
	}
	
	public double getPreco() {
		return this.price;
	}
	
	public int getQuantidade() {
		return this.quantity;
	}
	
	public double valorProduto() {
		return this.price * this.quantity;
	}
}
