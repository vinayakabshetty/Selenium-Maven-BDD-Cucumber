package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SauceLabsInventoryPage;

public class SauceLabsInventoryPageSteps {

	SauceLabsInventoryPage sauceLabsInventoryPage = new SauceLabsInventoryPage();

	@Given("user is in swag labs inventory page")
	public void user_is_in_swag_labs_inventory_page() {
		String actualTitle = sauceLabsInventoryPage.getPageTitle().trim();
		String expectedTitle = "Products";
		Assert.assertTrue(actualTitle.equals(expectedTitle));
	}

	@Then("swag labs inventory page will display")
	public void swag_labs_inventory_page_will_display() {
		String actualTitle = sauceLabsInventoryPage.getPageTitle().trim();
		String expectedTitle = "Products";
		Assert.assertTrue(actualTitle.equals(expectedTitle));
	}

	@When("user clicks on hamburger icon button in swag labs inventory page")
	public void user_clicks_on_hamburger_icon_button_in_swag_labs_inventory_page() {
		sauceLabsInventoryPage.clickOnOptionsMenu();
	}

	@When("user clicks on Logout button")
	public void user_clicks_on_logout_button() {
		sauceLabsInventoryPage.clickOnLogoutFromOptionsMenu();
	}
}
