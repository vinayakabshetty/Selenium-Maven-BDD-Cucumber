package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import pages.SwagLabsInventoryPage;

public class SwagLabsInventoryPageSteps {

	SwagLabsInventoryPage swagLabsInventoryPage = new SwagLabsInventoryPage();

	@Then("^swag labs inventory page will display$")
	public void swag_labs_inventory_page_will_display() {
		String actualPageTitle = swagLabsInventoryPage.getPageHeader();
		String expectedPageTitle = "Products";
		Assert.assertTrue(expectedPageTitle.equals(actualPageTitle));
	}
}
