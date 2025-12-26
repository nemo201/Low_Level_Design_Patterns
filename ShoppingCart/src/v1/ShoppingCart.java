package v1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	private Map<String, CartItem> items = new HashMap<>();

	public void addItem(Product product, int quantity) {
		items.compute(product.getId(), (k, v) -> {
			if (v == null) {
				return new CartItem(product, quantity);
			} else {
				v.increaseQuantity(quantity);
				return v;
			}
		});
	}

	public void updateItemQuantity(String productId, int quantity) {
		if (!items.containsKey(productId)) {
			throw new RuntimeException("Product not found in cart");
		}

		items.get(productId).updateQuantity(quantity);
	}

	public void removeItem(String productId) {
		if (!items.containsKey(productId)) {
			throw new RuntimeException("Product not found in cart");
		}

		items.remove(productId);
	}

	public Collection<CartItem> getItems() {
		return items.values();
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}
}
