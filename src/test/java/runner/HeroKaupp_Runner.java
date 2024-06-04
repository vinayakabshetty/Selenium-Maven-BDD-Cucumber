package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src//test//java//features" }, glue = { "stepdefinitions",
		"applicationHooks" }, tags = "@Sanity", plugin = { "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, publish = true, monochrome = false, dryRun = false)
public class HeroKaupp_Runner {
}
