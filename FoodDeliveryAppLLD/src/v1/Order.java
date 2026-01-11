package v1;

import java.util.List;

public class Order {
	private final String orderId;
	private OrderStatus status;
	private final List<OrderItem> items;
	private Payment payment;
	private DeliveryTask deliveryTask;
	
	Order(String orderId, List<OrderItem> items) {
		this.orderId = orderId;
		this.items = items;
		this.status = OrderStatus.CREATED;
	}
	
	public synchronized void markPaid(Payment payment) {
		if (status != OrderStatus.CREATED) {
			throw new IllegalStateException("Invalid state");
		}
		this.payment = payment;
		this.status = OrderStatus.PAID;
	}
	
	public synchronized void assignDelivery(DeliveryTask task) {
		this.deliveryTask = task;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
}
