package parallel;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.SwagLabsLoginPage;
import qa.factory.DriverFactory;

public class SwagLabsLoginPageSteps {

	SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage();

	@Given("user is in swag labs login page")
	public void user_is_in_swag_labs_login_page() {
		DriverFactory.getDriver().get("https://www.saucedemo.com");
		String actualPageTitle = swagLabsLoginPage.getPageTitle();
		String expectedPageTitle = "Swag Labs";
		Assert.assertTrue(expectedPageTitle.equals(actualPageTitle));
	}

	@Given("^user enters username (.*) in swag labs login page$")
	public void user_enters_username_in_swag_labs_login_page(String username) {
		swagLabsLoginPage.enterUserName(username);
	}

	@Given("^user enters password (.*) in swag labs login page$")
	public void user_enters_password_in_swag_labs_login_page(String password) {
		swagLabsLoginPage.enterPassword(password);
	}

	@Given("clicks on login button in swag labs login page")
	public void clicks_on_login_button_in_swag_labs_login_page() {
		swagLabsLoginPage.clickOnLoginButton();
	}

	@Then("error message {string} will display in swag labs login page")
	public void error_message_will_display_in_swag_labs_login_page(String expectedErrorMessage) {
		String actualErrorMessage = swagLabsLoginPage.getErrorMessage();
		Assert.assertTrue(expectedErrorMessage.equals(actualErrorMessage));
	}
}
