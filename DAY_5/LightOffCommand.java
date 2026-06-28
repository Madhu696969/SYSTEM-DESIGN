package DAY_5;

public class LightOffCommand implements execute{
	
	private Light light;
	public LightOffCommand(Light li) {
		this.light=li;
	}
	public void execute() {
		light.off();
	}
}
