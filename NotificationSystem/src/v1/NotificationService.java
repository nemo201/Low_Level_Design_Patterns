package v1;

public class NotificationService {
	private final QueueProducer producer;
	
	NotificationService(QueueProducer producer) {
		this.producer = producer;
	}
	
	public void send(Notification notification) {
		notification.status = NotificationStatus.QUEUED;
		producer.publish(notification);
	}
}
