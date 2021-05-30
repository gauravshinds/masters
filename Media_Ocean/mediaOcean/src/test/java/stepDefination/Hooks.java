package stepDefination;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import utilities.TestContext;
import utilities.WebDriverManagerr;

public class Hooks {
	
	TestContext testContext;
	WebDriverManagerr webDriverManager;
	WebDriver driver;
		
		public Hooks(TestContext context) {
			testContext = context;
		
		}

		@After(order = 0)
		public void AfterSteps() throws Exception {
			testContext.getWebDriverManager().closeDriver();

		}

}
