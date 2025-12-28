package v2_AmazonCart;

public class CartService {
	private CartRepository cartRepository;
	private InventoryService inventoryService;

	public CartService(CartRepository cartRepository, InventoryService inventoryService) {
		this.cartRepository = cartRepository;
		this.inventoryService = inventoryService;
	}

	public synchronized void addItem(String userId, Product product, int quantity) {
		Cart cart = cartRepository.getOrCreateCart(userId);

		if (cart.getStatus() != CartStatus.ACTIVE) {
			throw new RuntimeException("Cannot modify a non-active cart");
		}
		inventoryService.reserve(product.getProductId(), quantity);
		cart.getItems().compute(product.getProductId(), (k, v) -> {
			if (v == null) {
				return new CartItem(product.getProductId(), quantity, product.getPrice());
			}
			v.setQuantity(v.getQuantity() + quantity);
			return v;
		});

		cart.setLastUpdated(System.currentTimeMillis());
		cartRepository.saveCart(cart);

		System.out.println(Thread.currentThread().getName() + " added " + quantity + " of " + product.getProductName());
	}
}
