package v1;

public class CartItem {
	private Product product;
	private int quantity;
	
	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public void increaseQuantity(int amount) {
		this.quantity += amount;
	}
	
	public void updateQuantity(int quantity) {
		if (quantity <= 0) {
			throw new RuntimeException("Quantity must be greater than zero");
		}
		this.quantity = quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getTotalPrice() {
		return product.getPrice() * quantity;
	}
}
