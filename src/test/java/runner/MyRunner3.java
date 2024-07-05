package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "@target/FailedRerunTestCases.txt" }, glue = { "stepdefinitions",
		"applicationHooks" }, plugin = { "pretty",
				"html:target/cucumber-reports.html" }, monochrome = false, dryRun = false, publish = true)
public class MyRunner3 {

}