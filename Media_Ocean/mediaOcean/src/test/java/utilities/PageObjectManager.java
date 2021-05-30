package utilities;

import org.openqa.selenium.WebDriver;
import pageObject.StackOverflowLoginPage;
import pageObject.StackOverflowSearchPage;

public class PageObjectManager {
	
	private WebDriver driver;
	private StackOverflowLoginPage loginStackOverflowPage;
	private StackOverflowSearchPage stackSearchPage;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	public StackOverflowLoginPage getLoginPage() {
		return (loginStackOverflowPage == null) ? loginStackOverflowPage = new StackOverflowLoginPage(driver) : loginStackOverflowPage;
	}
	public StackOverflowSearchPage getStackOverflowSearchPage() {
		return (stackSearchPage == null) ? stackSearchPage = new StackOverflowSearchPage(driver) : stackSearchPage;
	}
	

}
