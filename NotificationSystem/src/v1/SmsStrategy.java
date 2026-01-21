package v1;

public class SmsStrategy implements ChannelStrategy{
	@Override
	public void send(Notification notification) {
		// TODO Auto-generated method stub
		System.out.println("Sending SMS Notification to user: " + notification.userId);
		
	}
}