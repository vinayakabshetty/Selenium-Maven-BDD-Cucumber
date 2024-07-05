package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import qa.factory.DriverFactory;

public class SwagLabsInventoryPage {

	private WebDriver driver;
	private By productsPageHeader = By.xpath("//span[contains(text(),'Products')]");

	public SwagLabsInventoryPage() {
		this.driver = DriverFactory.getDriver();
	}

	public String getPageHeader() {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(productsPageHeader));
		return driver.findElement(productsPageHeader).getText();
	}
}
