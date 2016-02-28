package tablelamp;

import buttons.Button;
import buttons.PushdownButton;
import lightbulbs.Lightbulb;

public class Main {

	public static void main(String[] args) {
		Lightbulb lbulb = new Lightbulb();
		Button btn = new Button(lbulb);
		btn.switchOn();
		btn.switchOff();
		
		PushdownButton pdbtn = new PushdownButton(lbulb);
		pdbtn.PushButton();
		pdbtn.PushButton();
	}

}
