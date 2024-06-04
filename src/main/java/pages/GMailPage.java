package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import qa.factory.DriverFactory;

public class GMailPage {

	private WebDriver driver;
	private By gmailSignOnPage = By.name("");

	public GMailPage() {
		driver = DriverFactory.getDriver();
	}

	public boolean verifyGmailSignOnPage() {
		return driver.findElement(gmailSignOnPage).isDisplayed();
	}
}