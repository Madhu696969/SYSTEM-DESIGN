package DAY_5;

public class LightOnCommand implements execute{
	
	private Light light;
	public LightOnCommand(Light li) {
		this.light=li;
	}
	public void execute() {
		light.on();
	}

}
