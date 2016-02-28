package buttons;

import lightbulbs.ILightbulb;

public class Button {
	
	private ILightbulb ilbulb;
	public Button(ILightbulb lb)
	{
		ilbulb = lb;
	}
	//private Lightbulb lbulb = new Lightbulb();
	public void switchOn()
	{
		System.out.println("Button switched to ON");
		ilbulb.on();
	}
	
	public void switchOff()
	{
		System.out.println("Button switched to OFF");
		ilbulb.off();
	}


}
