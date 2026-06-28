package DAY_5;

public class Remote {
	private execute ex;
	public Remote(execute e) {
		this.ex=e;
	}
	public void pressButton() {
		ex.execute();
	}

}
