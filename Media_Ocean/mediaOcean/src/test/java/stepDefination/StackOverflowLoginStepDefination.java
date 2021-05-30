package stepDefination;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import pageObject.StackOverflowLoginPage;
import utilities.PageObjectManager;
import utilities.TestContext;
import utilities.WebDriverManagerr;

public class StackOverflowLoginStepDefination {
	
	WebDriver driver;
	TestContext testContext;
	PageObjectManager pageObject;
	private StackOverflowLoginPage loginPage;
	
	public StackOverflowLoginStepDefination(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
	}
	
	@Given("^Navigate stackoverflow by Using \"([^\"]*)\" URL$")
	public void navigate_stackoverflow_by_Using_URL(String url) throws Exception {
		driver = new WebDriverManagerr().getDriver();
		System.out.println("I am hitting to URL.....");
		driver.get(url);
		loginPage.accept_Cookies_if_it_is_Present();
		
	}
	

}
