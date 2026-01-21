package v1;

import java.util.List;

public class Notification {
	String notificationId;
	String userId;
	ChannelType channel;
	NotificationStatus status;
	String payload;
	
	List<DeliveryAttempt> attempts;
	
	public synchronized void markSent() {
		this.status = NotificationStatus.SENT;
	}
	
	public synchronized void markFailed() {
		this.status = NotificationStatus.FAILED;
	}
}
