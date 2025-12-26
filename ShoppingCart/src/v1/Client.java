package v1;

public class Client {
		public static void main(String[] args) {
		// Create products
		Product apple = new Product("1", "Apple", 20);
		Product banana = new Product("2", "Banana", 5);

		// Create shopping cart
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(apple, 4);
		cart.addItem(banana, 6);

		// Create pricing service with no discount
		PricingService pricingService = new PricingService(new NoDiscount());

		// Calculate total
		double total = pricingService.calculateTotal(cart);
		System.out.println("Total amount: $" + total);
		
		cart.updateItemQuantity("1", 10);
		total = pricingService.calculateTotal(cart);
		System.out.println("Total amount after updating quantity: $" + total);
		
		
	}
}
