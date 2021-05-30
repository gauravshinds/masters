package utilities;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(features = {"resourceFiles/features"}, 
			glue = "stepDefination",
			plugin = {"pretty","html:target/cucumber","json:target/cucumber.json"},
			monochrome = true,
			dryRun = false  
			)  
 
	public class TestRunner {
	
	}
