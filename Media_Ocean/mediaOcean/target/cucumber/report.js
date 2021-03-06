$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("resourceFiles/features/stackOverflow.feature");
formatter.feature({
  "name": "StackOverFlow results title with their respective Votes \u0026 Answer",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To check list of results title with their respective Votes \u0026 Answer from stackoverflow",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Navigate stackoverflow by Using \"https://stackoverflow.com/questions\" URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StackOverflowLoginStepDefination.navigate_stackoverflow_by_Using_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for \"[Selenium]\" keyword in searchbar",
  "keyword": "And "
});
formatter.match({
  "location": "StackOverflowSearchPageStepDefination.search_for_keyword_in_seachbar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify fifteen results are returned on the first page",
  "keyword": "Then "
});
formatter.match({
  "location": "StackOverflowSearchPageStepDefination.verify_fifteen_results_are_returned_on_the_first_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sort the results by Votes has received",
  "keyword": "And "
});
formatter.match({
  "location": "StackOverflowSearchPageStepDefination.sort_the_results_by_Votes_has_received()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Extract all results titles with respective Votes and Answer count",
  "keyword": "When "
});
formatter.match({
  "location": "StackOverflowSearchPageStepDefination.extract_all_results_titles_with_respective_Votes_and_Answer_count()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find out all other tags on questions",
  "keyword": "Then "
});
formatter.match({
  "location": "StackOverflowSearchPageStepDefination.find_out_all_other_tags_on_questions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to each question and extract out the vote recieved by accepted answer",
  "keyword": "Then "
});
formatter.match({
  "location": "StackOverflowSearchPageStepDefination.go_to_each_question_and_extract_out_the_vote_recieved_by_accepted_answer()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027js-accepted-answer-indicator grid--cell fc-green-500 py6 mtn8\u0027]\"}\n  (Session info: chrome\u003d90.0.4430.212)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0-beta-3\u0027, revision: \u00275d108f9a67\u0027\nSystem info: host: \u0027DESKTOP-KPT0M3P\u0027, ip: \u0027192.168.0.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [3bc98a4b21f0f9d6a3c33761ad7675d9, findElement {using\u003dxpath, value\u003d//div[@class\u003d\u0027js-accepted-answer-indicator grid--cell fc-green-500 py6 mtn8\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.212, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\91976\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:63994}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:63994/devtoo..., se:cdpVersion: 90.0.4430.212, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 3bc98a4b21f0f9d6a3c33761ad7675d9\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:198)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:131)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:153)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:128)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:619)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$Mechanism$2.findElement(RemoteWebDriver.java:1258)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:386)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:380)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy34.getAttribute(Unknown Source)\r\n\tat pageObject.StackOverflowSearchPage.getAcceptedAnswerCount(StackOverflowSearchPage.java:100)\r\n\tat stepDefination.StackOverflowSearchPageStepDefination.go_to_each_question_and_extract_out_the_vote_recieved_by_accepted_answer(StackOverflowSearchPageStepDefination.java:75)\r\n\tat ???.Go to each question and extract out the vote recieved by accepted answer(resourceFiles/features/stackOverflow.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});