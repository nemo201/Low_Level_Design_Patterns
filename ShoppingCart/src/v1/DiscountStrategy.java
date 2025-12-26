package v1;

public interface DiscountStrategy {
	double applyDiscount(double totalAmount);
}

class NoDiscount implements DiscountStrategy {
	@Override
	public double applyDiscount(double totalAmount) {
		return totalAmount;
	}
}
