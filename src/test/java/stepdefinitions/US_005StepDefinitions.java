package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_005Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_005StepDefinitions {

    US_005Page us_005Page = new US_005Page();

    @When("user goes to {string}")
    public void userGoesTo(String GmiBank_HomePage) {
        Driver.getDriver().get(ConfigReader.getProperty(GmiBank_HomePage));
    }

    @Then("user clicks Sign In dropdown menu")
    public void userClicksSignInDropdownMenu() {
        us_005Page.signInDropdown.click();
    }

    @Then("user clicks Sign In link.")
    public void userClicksSignInLink() throws InterruptedException {
        us_005Page.signIn.click();
    }

    @Then("user enters an {string} to username text box.")
    public void userEntersAnToUsernameTextBox(String invalid_username) {
        us_005Page.username_textBox.sendKeys(ConfigReader.getProperty(invalid_username));
    }

    @Then("user enters a {string} to password text box.")
    public void userEntersAToPasswordTextBox(String valid_passwordd) {
        us_005Page.password_textBox.sendKeys(ConfigReader.getProperty(valid_passwordd));

    }


    @And("user sees an {string}.")
    public void userSeesAn(String error_message) {
        Assert.assertTrue(ConfigReader.getProperty(error_message), us_005Page.error_message.getText);
    }
}
