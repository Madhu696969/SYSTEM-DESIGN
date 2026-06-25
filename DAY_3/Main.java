package DAY_3;

public class Main {
	public static void main(String[] args) {
		Notification service=NotificationFactory.create("Email");
		service.sent();
	}
}
