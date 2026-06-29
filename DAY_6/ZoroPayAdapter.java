package DAY_6;

public class ZoroPayAdapter implements PaymentGateway{
	
	private ZoroPay Zoro;
	public ZoroPayAdapter() {
		Zoro=new ZoroPay();
	}
	public void pay(double amount) {
		Zoro.payAmount(amount);
	}

}
