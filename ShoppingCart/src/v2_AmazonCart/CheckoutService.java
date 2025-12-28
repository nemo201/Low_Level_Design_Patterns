package v2_AmazonCart;

public class CheckoutService {
	public synchronized void checkout(Cart cart) {
		if (cart.getStatus() != CartStatus.ACTIVE) {
			throw new RuntimeException("Cannot checkout a non-active cart");
		}

		cart.setStatus(CartStatus.CHECKOUT_IN_PROGRESS);

		double totalAmount = 0;

		for (CartItem item : cart.getItems().values()) {
			totalAmount += item.totalPrice();
		}

		cart.setStatus(CartStatus.ORDER_CREATED);

		System.out.println("Order placed for user " + cart.getUserId() + " | Total = ₹" + totalAmount);
	}
}
