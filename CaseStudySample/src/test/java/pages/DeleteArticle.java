package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DeleteArticle {
	@FindBy(css="button[class='btn btn-sm']")
	WebElement deleteArt;
	
	
	
	public DeleteArticle(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
  @Test
  public void DelArt() {
	  deleteArt.click();
	  
  }

public void VerifyDelArtdisplayed() {
	deleteArt.isDisplayed();
	
}

}
