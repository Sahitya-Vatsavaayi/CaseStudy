package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ViewArticle {
	
	@FindBy(linkText="Global Feed")
	WebElement GFeedBtn;
	
	@FindBy(linkText="SeleniumTest1")
	WebElement artClick;
	
	@FindBy(xpath="//h1[text()='SeleniumTest1']")
	WebElement artView;
	
	public ViewArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
  @Test
  public void viewTheArticle() {
	  GFeedBtn.click();
	  artClick.click();
	  artView.getText();
  }
}
