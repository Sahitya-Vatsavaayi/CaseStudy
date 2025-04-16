package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {
	
	@FindBy(linkText="Login")
	WebElement mainlogin;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement login;
	
	@FindBy(xpath ="//button[text()='Your Feed']")
	WebElement HomeVerify;
	
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
  @Test
  public void LoginApp(String strmail,String strpwd) {
	 mainlogin.click();
	  email.sendKeys(strmail);
	  pwd.sendKeys(strpwd);
	  login.click();
	
	  }
  
public void HomePage() {
	 HomeVerify.getText();
	  Assert.assertEquals(HomeVerify.getText(), "Your Feed");
	
}
  }

