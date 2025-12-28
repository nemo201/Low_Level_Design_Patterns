package v2_AmazonCart;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {
	private Map<String, Integer> stock = new HashMap<>();
	
	public void addStock(String productId, int quantity) {
		stock.put(productId, stock.getOrDefault(productId, 0) + quantity);
	}
	
	public synchronized void reserve(String productId, int quantity) {
		int available = stock.getOrDefault(productId, 0);
		if (available < quantity) {
			throw new RuntimeException("Insufficient stock for product: " + productId);
		}
		stock.put(productId, available - quantity);
	}
	
	public synchronized void release(String productId, int quantity) {
		stock.put(productId, stock.getOrDefault(productId, 0) + quantity);
	}
}
