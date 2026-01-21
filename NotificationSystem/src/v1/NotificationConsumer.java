package v1;

import java.util.Map;

public class NotificationConsumer {
	private final Map<ChannelType, ChannelStrategy> strategies;
	
	NotificationConsumer(Map<ChannelType, ChannelStrategy> stratergies) {
		this.strategies = stratergies;
	}
	
	public void consume(Notification notification) {
		try {
			strategies.get(notification.channel).send(notification);
			notification.markSent();
		} catch (Exception e) {
			notification.markFailed();
		}
	}
}
