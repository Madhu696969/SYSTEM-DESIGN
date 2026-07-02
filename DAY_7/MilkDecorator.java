package DAY_7;

public class MilkDecorator extends CoffeeDecorator{
	
	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}
	public double getCost() {
		return coffee.getCost()+20;
	}
	public String getDescription() {
		return coffee.getDescription()+"Milk";
	}
}
