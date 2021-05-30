package utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerr {
	
	public static WebDriver driver;
	//private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	String projectPath = System.getProperty("user.dir");
	
	public WebDriverManagerr() {
		
	}
	
	public WebDriver getDriver() {
		if(driver == null) driver = setUpDrivers();
		return driver;
	}
	public WebDriver setUpDrivers() {	
		WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
		return driver; 
		
	}
	
	public void closeDriver() throws Exception {
		driver.quit();
		Thread.sleep(2000);
		driver = null;
	}

}
