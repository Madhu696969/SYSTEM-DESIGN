package DAY_5;

public class Main {
	public static void main(String[] args) {
		
		Light li=new Light();
		
		LightOnCommand cm=new LightOnCommand(li);
		
		Remote rem=new Remote(cm);
		//On
		rem.pressButton();
		
		LightOffCommand cmOff=new LightOffCommand(li);
		
		Remote remOff=new Remote(cmOff);
		
		remOff.pressButton();
		
	}

}
