package tablelamp;

import java.io.*;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import buttons.PushdownButton;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Testbuttons.class, Testpushdownbuttons.class, Testlightbulb.class })
public class Testsuite {

}
