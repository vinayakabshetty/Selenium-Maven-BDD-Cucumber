package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src//test//java//features" }, glue = { "stepdefinitions",
		"applicationHooks" }, tags = "@Sanity", plugin = { "pretty", "html:target/report.html",
				"json:target/report.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, publish = false, monochrome = false, dryRun = false)
public class HeroKaupp_Runner {
}
