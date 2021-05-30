Feature: StackOverFlow results title with their respective Votes & Answer

  Scenario: To check list of results title with their respective Votes & Answer from stackoverflow
    Given Navigate stackoverflow by Using "https://stackoverflow.com/questions" URL
    And Search for "[Selenium]" keyword in searchbar
    Then Verify fifteen results are returned on the first page
    And Sort the results by Votes has received
    When Extract all results titles with respective Votes and Answer count
    Then Find out all other tags on questions
    Then Go to each question and extract out the vote recieved by accepted answer
