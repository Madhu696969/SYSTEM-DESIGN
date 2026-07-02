package DAY_7;

public class ChocolateDecorator extends CoffeeDecorator{
	
	public ChocolateDecorator(Coffee coffee) {
		super(coffee);
	}
	
	public double getCost() {
		return coffee.getCost()+40;
	}
	public String getDescription() {
		return coffee.getDescription()+"Chocolate";
	}
}
