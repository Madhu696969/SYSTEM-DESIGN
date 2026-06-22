package DAY_1;

public class Main {
	public static void main(String[] args) {
		PaymentStrategy strategy = new Paypal();
	    PaymentService service =new PaymentService(strategy);
	    service.Payment();
	}
}
