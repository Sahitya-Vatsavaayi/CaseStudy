package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewArticle {
	
	@FindBy(linkText="Home")
	WebElement HomeBtn;
	
	@FindBy(css="button[class='nav-link ']")
	WebElement GFeedBtn;
	
	@FindBy(xpath="//h1[text()='BingoTitle9']")
	WebElement artClick;
	
	@FindBy(xpath="//h1[text()='BingoTitle9']")
	WebElement artView;
	
	public ViewArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
  @Test
 
public void GlobalFeed() throws InterruptedException {
	 HomeBtn.click();
	 Thread.sleep(2000);
	  GFeedBtn.click();
	  Thread.sleep(3000);
	
}

public void ClickArticle() {
	artClick.click();
	
}

public void AssetView() {
	artView.getText();
	  Assert.assertEquals(artView.getText(), artClick.getText());
	
}
}
