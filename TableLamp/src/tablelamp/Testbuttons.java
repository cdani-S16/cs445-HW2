package tablelamp;

import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import buttons.Button;

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
		Button btn = new Button();
		btn.switchOn();
		btn.switchOff();
		
		
		assertEquals("Button switched to ON\nLightbulb on\nButton switched to OFF\nLightbulb off".trim(),outputContent.toString().trim());
		
	}
}
