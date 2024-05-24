package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import qa.factory.DriverFactory;

public class SauceLabsInventoryPage {

	WebDriver driver;
	private By inventoryPageTitle = By.xpath("//span[contains(text(),'Products')]");
	private By hamburger_optionsmenu = By.xpath("//button[@id='react-burger-menu-btn']");
	private By optionsMenu_logout = By.linkText("Logout");

	public SauceLabsInventoryPage() {
		this.driver = DriverFactory.getDriver();
	}
	
	public void clickOnOptionsMenu() {
		driver.findElement(hamburger_optionsmenu).click();
	}
	
	public void clickOnLogoutFromOptionsMenu() {
		driver.findElement(optionsMenu_logout).click();
	}
	
	public String getPageTitle() {
		return driver.findElement(inventoryPageTitle).getText().trim();
	}
	
	
}