package v1;

import java.util.List;
import java.util.UUID;

public class OrderService {
	public Order createOrder(User user, List<OrderItem> items) {
		return new Order(UUID.randomUUID().toString(), items);
	}
	
	public void processPayment(Order order, Payment payment) {
		order.markPaid(payment);
	}
}
