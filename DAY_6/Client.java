package DAY_6;

public class Client {
	
	public static void main(String[] args) {
		PaymentGateway pay=new ZoroPayAdapter();
		pay.pay(1000);
		
	}

}
