package utilities;

public class TestContext {
	
	private PageObjectManager pageObjectManger;
	private WebDriverManagerr webDriverManager;
	
	
	public TestContext(){
		webDriverManager = new WebDriverManagerr();
		pageObjectManger = new PageObjectManager(webDriverManager.getDriver());
		
	}
	
	public WebDriverManagerr getWebDriverManager() {
		return webDriverManager;
	}
	public PageObjectManager getPageObjectManager() {
		return pageObjectManger;
	}

}
