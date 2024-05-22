package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import qa.factory.DriverFactory;

public class HeroKauppHomePage {

	private WebDriver driver;
	private By availableExampleLinks = By.xpath("//li//a");

	public HeroKauppHomePage() {
		this.driver = DriverFactory.getDriver();
	}

	public List<WebElement> listAvailableLinks() {
		List<WebElement> availableLinks = driver.findElements(availableExampleLinks);
		return availableLinks;
	}

	public String getPageTitle() {
		return driver.getTitle().trim();
	}
}