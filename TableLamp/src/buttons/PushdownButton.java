package buttons;

import lightbulbs.ILightbulb;

public class PushdownButton {
	
	private ILightbulb ilbulb;// = new ILightbulb();
	public PushdownButton(ILightbulb lb)
	{
		ilbulb = lb;
	}

	private boolean Lflag = false;
	public void PushButton()
	{
		if(!Lflag)
		{
			System.out.println("Button toggled");
			ilbulb.on();
			Lflag = true;
		}
		else
		{
			System.out.println("Button toggled");
			ilbulb.off();
			Lflag = false;
		}
	}

}
