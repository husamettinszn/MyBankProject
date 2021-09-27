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
         System.out.println(us_005Page.error_message.getText());
        System.out.println(ConfigReader.getProperty(error_message));
         Assert.assertEquals(us_005Page.error_message.getText(), ConfigReader.getProperty(error_message));
    }

    @Then("user enter a {string} to username textbox.")
    public void userEnterAToUsernameTextbox(String valid_username1) {
        us_005Page.username_textBox.sendKeys(ConfigReader.getProperty(valid_username1));
    }

    @Then("user enters an {string} to passwor text box.")
    public void userEntersAnToPassworTextBox(String invalid_password) {
        us_005Page.password_textBox.sendKeys(invalid_password);
    }

    @Then("user sees a {string}.")
    public void userSeesA(String passwordReset_message) {
        System.out.println(us_005Page.passwordRest_message.getText());
        Assert.assertTrue(us_005Page.passwordRest_message.isDisplayed());
    }

    @Then("user clicks passwordReset_link.")
    public void userClicksPasswordReset_link() {
        us_005Page.passwordRest_message.click();
    }

    @And("user sees Password Reset button is clickable.")
    public void userSeesPasswordResetButtonIsClickable() {
        Assert.assertTrue(us_005Page.resetPassword_button.isEnabled());

    }

    @Then("clicks sees New Account Register link")
    public void clicksSeesNewAccountRegisterLink() {
        us_005Page.registerNewAccount_link.click();
    }

    @And("user goes Registration Page {string}")
    public void userGoesRegistrationPage(String registiration_page) {
        System.out.println(ConfigReader.getProperty(registiration_page));
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertEquals(ConfigReader.getProperty(registiration_page), Driver.getDriver().getCurrentUrl());
    }
}
