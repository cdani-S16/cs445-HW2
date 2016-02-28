package buttons;

import lightbulbs.Lightbulb;

public class PushdownButton {
	
	private Lightbulb lbulb = new Lightbulb();
	private boolean Lflag = false;
	public void PushButton()
	{
		if(!Lflag)
		{
			System.out.println("Button toggled");
			lbulb.on();
			Lflag = true;
		}
		else
		{
			System.out.println("Button toggled");
			lbulb.off();
			Lflag = false;
		}
	}

}
