package v1;

import java.util.Map;

public class NotificationTemplate {
	String templateId;
	String body;
	
	public String render(Map<String, String> data) {
		return body;
	}
}
