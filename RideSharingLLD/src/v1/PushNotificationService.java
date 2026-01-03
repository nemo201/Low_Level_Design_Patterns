package v1;

public class PushNotificationService implements NotificationObserver {

	@Override
	public void notify(String message) {
		System.out.println("Push Notification: " + message);
	}

}
