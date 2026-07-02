package DAY_7;

public class MainApp {
	
	public static void main(String[] args) {
		Coffee cf=new SimpleCoffee();
		cf =new MilkDecorator(cf);
		System.out.println(cf.getDescription()+" "+cf.getCost());
		cf =new ChocolateDecorator(cf);
		System.out.println(cf.getDescription()+" "+cf.getCost());
	}
}
