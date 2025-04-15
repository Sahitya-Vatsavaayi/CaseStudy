package StepDefinition;

import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.java.en.Given;
import pages.CreateArticle;
import pages.LoginPage;

public class ConduitStepDef {
	WebDriver driver = TestBase.getDriver();
	 LoginPage login = new LoginPage(driver);
	 CreateArticle CrtArt=new CreateArticle(driver);
	 
}
