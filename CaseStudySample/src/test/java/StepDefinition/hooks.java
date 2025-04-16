package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Scenario;


import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;

public class hooks {
	WebDriver driver;
	
	@BeforeAll
	public static void setupDriver() throws IOException
	{
		TestBase.initDriver();
	}
//	@After
//	public void screenshots(Scenario scenario)
//	{
//		if(scenario.isFailed()) {
//			TakesScreenshot Sshot=(TakesScreenshot)driver;
//			byte[] img =Sshot.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(img, "image/png", "FailedScenarioScreenshots");
//			
//		}
//		TestBase.tearDown();
//	}

}
