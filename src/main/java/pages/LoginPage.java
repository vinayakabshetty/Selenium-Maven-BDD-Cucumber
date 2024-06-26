package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import qa.factory.DriverFactory;

public class LoginPage {

	private WebDriver driver;
	private By searchEditBox = By.name("q");
	private By gmailLink = By.linkText("Gmail");
	
	public LoginPage() {
		this.driver = DriverFactory.getDriver();
	}

	public void enterSearchItem(String itemName) {
		driver.findElement(searchEditBox).sendKeys(itemName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickOnEnterButton() {
		driver.findElement(searchEditBox).sendKeys(Keys.ENTER);
	}

	public void userClicksOnGmailLinkInGooglePage() {
		driver.findElement(gmailLink).click();
	}

}