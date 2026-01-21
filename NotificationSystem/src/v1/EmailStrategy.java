package v1;

public class EmailStrategy implements ChannelStrategy {

	@Override
	public void send(Notification notification) {
		// TODO Auto-generated method stub
		System.out.println("Sending Email Notification to user: " + notification.userId);
		
	}

}
