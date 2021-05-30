package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.BasePageObjects;
import utilities.WebDriverManagerr;

public class StackOverflowLoginPage extends BasePageObjects{
	
	WebDriver driver = (new WebDriverManagerr()).getDriver();

	public StackOverflowLoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(.,'Accept all cookies')]")
	private WebElement acceptAllCookies;
	
	public  boolean accept_Cookies_if_it_is_Present() {
		 boolean flag = true;
	        try {
	        	JavascriptExecutor je = ((JavascriptExecutor) driver);
				je.executeScript("arguments[0].click();",acceptAllCookies );
	        } catch(Exception e) {
	            flag = false;
	        }
	        return flag;
	    }

}
