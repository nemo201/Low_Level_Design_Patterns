package v2_AmazonCart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
	private String cartId;
	private String userId;
	private Map<String, CartItem> items = new HashMap<>();
	private CartStatus status = CartStatus.ACTIVE;
	private long lastUpdated = System.currentTimeMillis();
	
	public Cart(String cartId, String userId) {
		this.cartId = cartId;
		this.userId = userId;
	}

	public long getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(long lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Map<String, CartItem> getItems() {
		return items;
	}

	public void setItems(Map<String, CartItem> items) {
		this.items = items;
	}

	public CartStatus getStatus() {
		return status;
	}

	public void setStatus(CartStatus status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}
}
