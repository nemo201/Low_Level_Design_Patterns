package v1;

public class PricingService {
	private DiscountStrategy discountStrategy;
	
	public PricingService(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
	
	public double calculateTotal(ShoppingCart cart) {
		double total = 0.0;
		for (CartItem item : cart.getItems()) {
			total += item.getTotalPrice();
		}
		return discountStrategy.applyDiscount(total);
	}
}
