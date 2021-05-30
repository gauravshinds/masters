package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.BasePageObjects;
import utilities.WebDriverManagerr;

public class StackOverflowSearchPage extends BasePageObjects{
	
	WebDriver driver = (new WebDriverManagerr()).getDriver();
	public StackOverflowSearchPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Search…']")
	private WebElement searchPlaceHolder;
	
	@FindBy(how = How.XPATH, using = "//a[@class='s-pagination--item is-selected']")
	private WebElement pageCountOnFirstPage;
	
	@FindBy(how = How.XPATH, using = "//a[@class='question-hyperlink']")
	private List<WebElement> listOfResult;
	
	@FindBy(how = How.XPATH, using = "//button[@data-target='se-uql.toggleMoreButton']")
	private WebElement moreButton;
	
	@FindBy(how = How.XPATH, using = "//a[@data-shortcut='V']")
	private WebElement votesValue;
	
	@FindBy(how = How.XPATH, using = "//div[@class='question-summary']/div[2]/h3/a")
	private List<WebElement> quetionTitle;
	
	@FindBy(how = How.XPATH, using = "//span[@class='vote-count-post ']/strong[1]")
	private List<WebElement> voteCount;
	
	@FindBy(how = How.XPATH, using = "//div[@class='stats']/div/strong[1]")
	private List<WebElement> answerCount;
	
	@FindBy(how = How.XPATH, using = "//div[@class='excerpt']/following-sibling::div/a")
	private List<WebElement> otherTagCount;
	
	@FindBy(how = How.XPATH, using = "//div[@itemprop='upvoteCount']")
	private List<WebElement> linnkWiseAnswerCount;
	
	@FindBy(how = How.XPATH, using = "//div[@class='js-accepted-answer-indicator grid--cell fc-green-500 py6 mtn8']")
	private WebElement acceptedAns;
	
	@FindBy(how = How.XPATH, using = "//div[@class='js-accepted-answer-indicator grid--cell fc-green-500 py6 mtn8']/preceding-sibling::div[2]")
	private WebElement count;
	
	public void searchText(String text) {
		searchPlaceHolder.clear();
		CommonMethods.sendKeys(searchPlaceHolder, text);
		searchPlaceHolder.sendKeys(Keys.ENTER);
	}
	
	public int countOnFirstPage() {
		return Integer.valueOf(pageCountOnFirstPage.getText().trim());	
	}
	
	public List<String> getAllLinkResultCount(){
		return CommonMethods.mapWebElementsToList(listOfResult);
	}

	public boolean clickMoreButton() {
		return CommonMethods.clickOnElement(moreButton);	
	}
	
	public boolean clickOnVotes() {
		return CommonMethods.clickOnElement(votesValue);
	}
	
	public List<String> getAllQuetionTitles(){
		return CommonMethods.mapWebElementsToList(quetionTitle);
	}
	
	public List<String> getAllVoteCount(){
		return CommonMethods.mapWebElementsToList(voteCount);
	}
	
	public List<String> getAllAnswerCount(){
		return CommonMethods.mapWebElementsToList(answerCount);
	}
	
	public List<String> getOtherTags(){
		return CommonMethods.mapWebElementsToList(otherTagCount);
	}
	
	public List<String> getAcceptedAnswerCount(){
		List<String> acceptedAnswers = new ArrayList<String>();
		for(int i=0; i<=quetionTitle.size(); i++) {
			quetionTitle.get(i).click();
			if(acceptedAns.getAttribute("aria-label").equals("Accepted")) {
				acceptedAnswers.add(count.getText().trim());
			}
			driver.navigate().back();
		}
		return acceptedAnswers;
	}
}
