package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class GoogleSearchPageSteps {

	LoginPage loginPage = new LoginPage();

	@Given("user enters {string} in search field")
	public void user_enters_in_search_field(String searchTerm) {
		loginPage.enterSearchItem(searchTerm);
	}

	@Given("user is in google search page")
	public void user_is_in_google_search_page() {
		String actualPageTitle = loginPage.getPageTitle();
		Assert.assertTrue(actualPageTitle.equals("Google"));
	}

	@When("user clicks on search icon")
	public void user_clicks_on_search_icon() {
		loginPage.clickOnEnterButton();
	}

}