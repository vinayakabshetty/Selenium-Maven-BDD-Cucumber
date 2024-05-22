package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import qa.factory.DriverFactory;

public class HomePage {

	private WebDriver driver;
	private By SearchResults = By.xpath("//a[@href='https://jmeter.apache.org/']//h3");

	public HomePage() {
		this.driver = DriverFactory.getDriver();
	}

	public String searchResult(){
		return driver.findElement(SearchResults).getText().trim();
	}
}
