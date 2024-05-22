package qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static ThreadLocal<WebDriver> tl_driver = new ThreadLocal<>();

	public WebDriver init_driver(String browserName) {
		System.out.println("Browser entered is : " + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome browser is setting up");
			WebDriverManager.chromedriver().setup();
			tl_driver.set(new ChromeDriver());
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tl_driver.set(new FirefoxDriver());
		} else if (browserName.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			tl_driver.set(new SafariDriver());
		} else {
			System.out.println("Please enter correct browser");
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}

	public static WebDriver getDriver() {
		return tl_driver.get();
	}

}
