package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.StackOverflowSearchPage;
import utilities.PageObjectManager;
import utilities.TestContext;

public class StackOverflowSearchPageStepDefination {
	
	WebDriver driver;
	PageObjectManager pageObject;
	TestContext testContext;
	private StackOverflowSearchPage searchPage;
	
	public StackOverflowSearchPageStepDefination(TestContext context) {
		testContext = context;
		searchPage = testContext.getPageObjectManager().getStackOverflowSearchPage();
	}
	
	@And("^Search for \"([^\"]*)\" keyword in searchbar$")
	public void search_for_keyword_in_seachbar(String textSelenium) {
	    searchPage.searchText(textSelenium);
	}

	@Then("^Verify fifteen results are returned on the first page$")
	public void verify_fifteen_results_are_returned_on_the_first_page() throws Exception {
		Thread.sleep(10000);
	    Assert.assertEquals("Checking link count with pagination per page number", searchPage.getAllLinkResultCount().size(), searchPage.countOnFirstPage());
	    Assert.assertEquals("Checking 15 value in pagination per page", 15, searchPage.countOnFirstPage());
	}

	@Then("^Sort the results by Votes has received$")
	public void sort_the_results_by_Votes_has_received() throws Exception {
	    Assert.assertTrue("Click on More button for Vote selection", searchPage.clickMoreButton());
	    Assert.assertTrue("Clicking on Votes", searchPage.clickOnVotes());
	    Thread.sleep(10000);
	}

	@When("^Extract all results titles with respective Votes and Answer count$")
	public void extract_all_results_titles_with_respective_Votes_and_Answer_count() {
	   List<String> allLiksTitle = searchPage.getAllLinkResultCount();
	   for(String linkTitle:allLiksTitle) {
		   System.out.println(linkTitle);
	   }
	   
	   List<String> allVoteCount = searchPage.getAllVoteCount();
	   for(String votes:allVoteCount) {
		   System.out.println(votes);
	   }
	   
	   List<String> allAnswerCount = searchPage.getAllAnswerCount();
	   for(String answersCount:allAnswerCount) {
		   System.out.println(answersCount);
	   }  
	   Assert.assertEquals("Size of links titles:15", 15, allLiksTitle.size());
	}

	@Then("^Find out all other tags on questions$")
	public void find_out_all_other_tags_on_questions() {
	    List<String> otherTags = searchPage.getOtherTags();
	    for(String otherTag:otherTags) {
	    	System.out.println(otherTag);
	    }
	}

	@Then("^Go to each question and extract out the vote recieved by accepted answer$")
	public void go_to_each_question_and_extract_out_the_vote_recieved_by_accepted_answer() {
		List<String> acceptedAns = searchPage.getAcceptedAnswerCount();
		for(String s:acceptedAns) {
			System.out.println(s);
		}
	    
	}


}
