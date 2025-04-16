package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EditArticle {
	
	@FindBy(linkText="Edit Article")
	WebElement editArt;
	
	@FindBy(css="textarea[name='body']")
	WebElement editBody;
	
	@FindBy(xpath="//button[text()='Update Article']")
	WebElement artUpdate;
	
	public EditArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
  @Test
public void UpdateArticleClick() {
	editArt.click();
	
}

public void UpdateDetails() {
	editBody.clear();
	editBody.sendKeys("Updated the body of article");
	
}

public void PublishUpdatedDetails() {
	artUpdate.click();
	
}
}
