package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CreateArticle;
import pages.LoginPage;

public class ConduitTest {
	WebDriver driver;
  	LoginPage loginPage;
  	CreateArticle createArticle;
  	
  	public ConduitTest(){
  	TestBase.initDriver();
		driver= TestBase.getDriver();
		loginPage = new LoginPage(driver);
		createArticle= new CreateArticle(driver);
  	}
  @Test
  public void setup() {
	  
	  		TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/");
	  	
	  	}
  @Test
  public void validLoginTest() {
	  	 loginPage.LoginApp("bing4053@gmail.com","Bingoboi@123");
	  	createArticle.CreateTheArticle("SeleniumTest1","fhdgjfg","jhdfdfhj");
	   }
}
