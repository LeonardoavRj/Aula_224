package entities;

public class Product {

	String name;
	Double price;
	public Product(String name, Double price) {
		super();
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
	
	//m�todo est�tico
	public static String staticUpperCase(Product p) {
		return p.getName().toUpperCase();
	}
	//m�todo n�o est�tico
	public String nonStaticUpperCase() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}			
}
