package v2_AmazonCart;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CartRepository {
	private Map<String, Cart> carts = new HashMap<>();
	
	public Cart getOrCreateCart(String userId) {
		return carts.computeIfAbsent(userId, k -> new Cart(UUID.randomUUID().toString(), k));
	}
	
	public void saveCart(Cart cart) {
		cart.setLastUpdated(System.currentTimeMillis());
	}
}
