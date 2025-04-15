package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateArticle {
	
	@FindBy(linkText="New Article")
	WebElement newart;
	
	@FindBy(xpath="//input[@name='title']")
	WebElement artTitle;
	
	@FindBy(css ="input[name='description']")
	WebElement artAbout;
	
	@FindBy(css="textarea[name='body']")
	WebElement artbody;
	
	@FindBy(css="button[type='submit']")
	WebElement artPublish;
	
	public CreateArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
  @Test
  public void CreateTheArticle(String strTitle,String strAbout,String strBody) {
	  newart.click();
	  artTitle.sendKeys(strTitle);
	  artAbout.sendKeys(strAbout);
	  artbody.sendKeys(strBody);
	  artPublish.click();
	  
  }
}
