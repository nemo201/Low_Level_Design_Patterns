package v1;

public class PushStrategy implements ChannelStrategy{
	@Override
	public void send(Notification notification) {
		// TODO Auto-generated method stub
		System.out.println("Sending Push Notification to user: " + notification.userId);
		
	}
}