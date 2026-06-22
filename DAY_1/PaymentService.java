package DAY_1;

public class PaymentService {
	PaymentStrategy PayStrat;
	
	public PaymentService(PaymentStrategy payStrat) {
	    this.PayStrat = payStrat;
	}
	public void Payment() {
		PayStrat.pay();
	}
}
