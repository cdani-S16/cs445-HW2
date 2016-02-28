package buttons;

import lightbulbs.Lightbulb;

public class Button {
	
	private Lightbulb lbulb = new Lightbulb();
	public void switchOn()
	{
		System.out.println("Button switched to ON");
		lbulb.on();
	}
	
	public void switchOff()
	{
		System.out.println("Button switched to OFF");
		lbulb.off();
	}


}
