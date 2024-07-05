package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src//test//java//features//Google.feature" }, glue = { "stepdefinitions", "applicationHooks" }, tags = 
		"@New" , plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, publish = true, monochrome = false, dryRun = false)
public class GoogleSearch_TestRunner {
}
