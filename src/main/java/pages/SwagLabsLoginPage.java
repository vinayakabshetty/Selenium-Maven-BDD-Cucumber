package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.factory.DriverFactory;

public class SwagLabsLoginPage {

	private WebDriver driver;
	private By userNameField = By.id("user-name");
	private By passwordField = By.id("password");
	private By loginButton = By.id("login-button");
	private By errorMessage = By.xpath("//h3[@data-test='error']");

	public SwagLabsLoginPage() {
		this.driver = DriverFactory.getDriver();
	}

	public String getPageTitle() {
		return driver.getTitle().trim();
	}

	public void enterUserName(String userName) {
		driver.findElement(userNameField).click();
		driver.findElement(userNameField).sendKeys(userName);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).click();
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}

	public String getErrorMessage() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
		return driver.findElement(errorMessage).getText().trim();
	}
}