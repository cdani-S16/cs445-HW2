package tablelamp;

import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import buttons.Button;
import lightbulbs.Lightbulb;

public class Testbuttons
{
	
	private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errorContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outputContent));
	    System.setErr(new PrintStream(errorContent));
	}


	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}


	@Test
	public void test()
	{
		Lightbulb lb = new Lightbulb();
		Button btn = new Button(lb);
		btn.switchOn();
		btn.switchOff();
		
		
		assertEquals("Button switched to ON\nLightbulb on\nButton switched to OFF\nLightbulb off".trim(),outputContent.toString().trim());
		
	}
}
