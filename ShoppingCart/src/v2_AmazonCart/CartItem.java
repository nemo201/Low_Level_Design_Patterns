package v2_AmazonCart;

public class CartItem {
	private String productId;
	private int quantity;
	private Money priceSnapshot;
	
	public CartItem(String productId, int quantity, Money priceSnapshot) {
		this.productId = productId;
		this.quantity = quantity;
		this.priceSnapshot = priceSnapshot;
	}
	
	public double totalPrice() {
		return priceSnapshot.getAmount() * quantity;
	}

	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

	public void setQuantity(int i) {
		// TODO Auto-generated method stub
		
	}
}
