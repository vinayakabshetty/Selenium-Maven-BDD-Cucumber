package stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import pages.GMailPage;

public class GMailPageSteps {

	GMailPage gmailPage = new GMailPage();

	@Then("gmail sign on page will display")
	public void gmail_inbox_page_will_display() {
		boolean gmailSignOnPageDisplayed = gmailPage.verifyGmailSignOnPage();
		Assert.assertTrue(gmailSignOnPageDisplayed);
	}
}