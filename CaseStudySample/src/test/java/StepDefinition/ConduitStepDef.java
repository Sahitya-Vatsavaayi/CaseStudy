package StepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateArticle;
import pages.DeleteArticle;
import pages.EditArticle;
import pages.LoginPage;
import pages.ViewArticle;

public class ConduitStepDef {
	WebDriver driver = TestBase.getDriver();
	 LoginPage login = new LoginPage(driver);
	 CreateArticle CrtArt=new CreateArticle(driver);
	 ViewArticle ViewArt= new ViewArticle(driver);
	 EditArticle EditArt=new EditArticle(driver);
	 DeleteArticle DeleteArt = new DeleteArticle(driver);
	 
	 
	 @Given("User is on Login page")
	 public void user_is_on_login_page() {
	     driver.get("https://conduit-realworld-example-app.fly.dev/");
	 }
	 @When("User provide {string} and {string}")
	 public void user_provide_and(String strmail, String strpwd) {
	   login.LoginApp(strmail,strpwd);
	 }
	 @Then("User should be on Home Page")
	 public void user_should_be_on_home_page() {
		 login.HomePage();
	
	 }
	 
	 @Given("User should be on New Article Page")
	 public void user_should_be_on_new_article_page() {
	     CrtArt.NewArticlePage();
	 }
	 @When("User enters Article details")
	 public void user_enters_article_details(DataTable userData) 
	 {
		 List<List<String>> data = userData.asLists();
			String strTitle=data.get(0).get(0);
			String strAbout=data.get(0).get(1);
			String strBody=data.get(0).get(2);
			String strTags=data.get(0).get(3);
			CrtArt.CreateTheArticle(strTitle, strAbout,strBody, strTags);
			
	 }
	 @Then("Article must be created")
	 public void article_must_be_created() {
		 CrtArt.PublishArticle();
	     
	 }
	 
	 @Given("User should be on Global Feed page")
	 public void user_should_be_on_global_feed_page() throws InterruptedException {
		 Thread.sleep(2000);
		 ViewArt.GlobalFeed();
	     
	 }
	 @When("User select an article {string}")
	 public void user_select_an_article(String string) {
		 ViewArt.ClickArticle();
	     
	 }
	 @Then("Article detail page must be displayed in view article")
	 public void article_detail_page_must_be_displayed() {
		 ViewArt.AssetView();
	     
	 }
	 
	 @Given("Article detail page must be displayed in update article")
	 public void article_detail_page() {
		 EditArt.UpdateArticleClick();
		 
	     
	 }

	 @When("User update article detail")
	 public void user_update_article_detail() {
		 EditArt.UpdateDetails();
	   
	 }
	 @Then("Article detail must be updated")
	 public void article_detail_must_be_updated() {
		 EditArt.PublishUpdatedDetails();
	 }
	 
	 @Given("Article detail page must be displayed in delete article")
	 public void article_detail() {
		 DeleteArt.VerifyDelArtdisplayed();
		 
	     
	 }
	 
	 @When("User delete article")
	 public void user_delete_article() {
	 DeleteArt.DelArt();
	 }
	 @Then("Article must be deleted")
	 public void article_must_be_deleted() {
		 driver.switchTo().alert().accept();
	 }
	 
	

	 
}
