package DAY_7;

public abstract class CoffeeDecorator implements Coffee{
	protected Coffee coffee;
	public CoffeeDecorator(Coffee cof) {
		this.coffee=cof;
	}
}
