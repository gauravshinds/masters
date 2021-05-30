package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WebDriverManagerr;

public class CommonMethods {
	
	public CommonMethods() {
		
	}
	
	static WebDriver driver = (new WebDriverManagerr()).getDriver();
	private static List<String> collectAllStrings;
	
	public static JavascriptExecutor executor() {
        return (JavascriptExecutor) driver;
    }
	
	public static void waitForPageLoad(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) (element)));
	}
	
	public static void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static List<String> mapWebElementsToList(List<WebElement> listOfWebElemets){
		collectAllStrings = new ArrayList<>();
		listOfWebElemets.forEach(filterString->collectAllStrings.add(filterString.getText().trim()));
		return collectAllStrings;
	}
	
	public static boolean clickOnElement(WebElement elementName) {
	    boolean result = false;
	        try {
	        	executor().executeScript("arguments[0].click();", elementName);
	            result = true;
	        } catch(StaleElementReferenceException e) {
	    }
	    return result;
	}
}
