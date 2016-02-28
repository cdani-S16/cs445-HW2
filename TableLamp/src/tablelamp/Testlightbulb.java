package tablelamp;

import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import lightbulbs.Lightbulb;

public class Testlightbulb 
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
		lb.on();
		lb.off();
		lb.on();
		
		assertEquals("Lightbulb on\nLightbulb off\nLightbulb on".trim(),outputContent.toString().trim());
		
	}
}
