package v2_AmazonCart;

public class Product {
	private String productId;
	private String name;
	private Money price;
	
	public Product(String productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = new Money(price);
	}
	
	public String getProductId() {
		return productId;
	}
	
	public Money getPrice() {
		return price;
	}

	public String getProductName() {
		// TODO Auto-generated method stub
		return name;
	}
}
