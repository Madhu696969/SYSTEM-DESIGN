package DAY_3;

public class NotificationFactory {
	
	public static Notification create(String service) {
		if(service.equals("Email")) {
			return new Email();
		}
		else if(service.equals("SMS")) {
			return new SMS();
		}
		return new WhatsApp();
	}
}
