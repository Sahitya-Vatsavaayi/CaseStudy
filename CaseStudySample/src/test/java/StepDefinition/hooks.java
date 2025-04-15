package StepDefinition;

import java.io.IOException;

import base.TestBase;
import io.cucumber.java.BeforeAll;

public class hooks {
	
	@BeforeAll
	public static void setupDriver() throws IOException
	{
		TestBase.initDriver();
	}

}
