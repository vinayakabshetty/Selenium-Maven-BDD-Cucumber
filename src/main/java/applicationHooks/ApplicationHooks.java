package applicationHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.factory.DriverFactory;
import qa.util.ConfigReader;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before(order=0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
	}

	@Before(order=1)
	public void launchBrowser() {
		String browserName1 = prop.getProperty("browser");
		System.out.println("Launch browser "+browserName1);
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName1);
		driver.get("https://the-internet.herokuapp.com");
	}

	@After(order=0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order=1)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			String screenShotName = scenario.getName().replaceAll("", "_");
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenShotName);
		}
	}
}
