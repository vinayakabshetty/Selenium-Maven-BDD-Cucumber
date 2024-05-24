package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import qa.factory.DriverFactory;

public class SauceLabsLoginPage {

	WebDriver driver;
	private By userNameField = By.id("user-name");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login-button");
	private By loginPageTitle = By.xpath("//div[contains(text(),'Swag Labs')]");

	public SauceLabsLoginPage() {
		this.driver = DriverFactory.getDriver();
	}

	public void enterUserName(String userName) {
		driver.findElement(userNameField).sendKeys(userName);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}

	public String getTitle() {
		return driver.findElement(loginPageTitle).getText().trim();
	}
}