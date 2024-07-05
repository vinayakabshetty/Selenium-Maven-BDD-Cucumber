package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src//test//resources//features//Google.feature" }, 
		glue = { "stepdefinitions", "applicationHooks" }, 
		plugin = {"pretty","html:target/cucumber-reports.html",
				"rerun:target/FailedRerunTestCases.txt"},
		monochrome = true
		)
public class MyRunner1 {

}