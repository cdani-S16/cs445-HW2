package tablelamp;

import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import buttons.PushdownButton;
import lightbulbs.Lightbulb;

public class Testpushdownbuttons
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
		PushdownButton pdbtn = new PushdownButton(lb);
		pdbtn.PushButton();
		pdbtn.PushButton();
		pdbtn.PushButton();
		
		assertEquals("Button toggled\nLightbulb on\nButton toggled\nLightbulb off\nButton toggled\nLightbulb on".trim(),outputContent.toString().trim());
		
	}
}
