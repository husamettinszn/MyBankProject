package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class US_002StepDefinitions {

    RegisterPage registerPage = new RegisterPage();

    @Given("User goes to GMi Bank Homepage")
    public void user_goes_to_g_mi_bank_homepage() {
        Driver.getDriver().get("https://gmibank.com/");
    }

    @And("User clicks the {string} from dropdown menu")
    public void userClicksTheFromDropdownMenu(String menu) throws InterruptedException {

        registerPage.dropdownMenu.click();
        registerPage.register.click();
    }

    @Given("User enter anything to SSN text box and presses the enter key")
    public void user_enter_anything_to_ssn_text_box_and_presses_the_enter_key() {
        registerPage.ssnTextBox.sendKeys(Keys.TAB);
    }

    @Then("User should see the SSN error message {string} message")
    public void userShouldSeeTheSSNErrorMessageMessage(String enter_ssn_message) {
        System.out.println(ConfigReader.getProperty(enter_ssn_message));
        System.out.println(registerPage.errorMessage.getText());
        Assert.assertEquals(ConfigReader.getProperty(enter_ssn_message), registerPage.errorMessage.getText());
    }


    @And("User enter anything to Firstname text box and presses the enter key")
    public void userEnterAnythingToFirstnameTextBoxAndPressesTheEnterKey() {
        registerPage.firstnameTextBox.sendKeys(Keys.TAB);
    }

    @Then("User should see the Firstname error message {string} message")
    public void userShouldSeeTheFirstnameErrorMessageMessage(String enter_firstname_message) throws InterruptedException {

        System.out.println(ConfigReader.getProperty(enter_firstname_message));
        System.out.println(registerPage.errorMessage.getText());
        Assert.assertEquals(ConfigReader.getProperty(enter_firstname_message), registerPage.errorMessage.getText());
    }

    @And("User enter anything to Lastname text box and presses the enter key")
    public void userEnterAnythingToLastnameTextBoxAndPressesTheEnterKey() {
        registerPage.lastnameTextBox.sendKeys(Keys.TAB);
    }

    @Then("User should see the Lastname error message {string} message")
    public void userShouldSeeTheLastnameErrorMessageMessage(String enter_lastname_message) {
        System.out.println(ConfigReader.getProperty(enter_lastname_message));
        System.out.println(registerPage.errorMessage.getText());
        Assert.assertEquals(ConfigReader.getProperty(enter_lastname_message), registerPage.errorMessage.getText());

    }

    @And("User enter anything to Adress text box and presses the enter key")
    public void userEnterAnythingToAdressTextBoxAndPressesTheEnterKey() {
        registerPage.addressTextBox.sendKeys(Keys.TAB);
    }

    @Then("User should see the Adress error message {string} message")
    public void userShouldSeeTheAdressErrorMessageMessage(String enter_adress_message) {
        Assert.assertEquals(ConfigReader.getProperty(enter_adress_message), registerPage.errorMessage.getText());
    }

    @And("User enter anything to Phone Number text box and presses the enter key")
    public void userEnterAnythingToPhoneNumberTextBoxAndPressesTheEnterKey() {
        registerPage.mobilephoneTextBox.sendKeys(Keys.TAB);
    }

    @Then("User should see the Phone Number error message {string} message")
    public void userShouldSeeThePhoneNumberErrorMessageMessage(String enter_phone_number_message) {
        Assert.assertEquals(ConfigReader.getProperty(enter_phone_number_message), registerPage.errorMessage.getText());
    }

    @And("User enter anything to Username text box and presses the enter key")
    public void userEnterAnythingToUsernameTextBoxAndPressesTheEnterKey() {
        registerPage.usernameTextBox.sendKeys(Keys.TAB);
    }

    @Then("User should see the Username error message {string} message")
    public void userShouldSeeTheUsernameErrorMessageMessage(String enter_username_message) {
        Assert.assertEquals(ConfigReader.getProperty(enter_username_message), registerPage.errorMessage.getText());
    }

    @And("User enter anything to Email text box and presses the enter key")
    public void userEnterAnythingToEmailTextBoxAndPressesTheEnterKey() {
        registerPage.emailTextBox.sendKeys(Keys.TAB);
    }

    @Then("User should see the Email error message {string} message")
    public void userShouldSeeTheEmailErrorMessageMessage(String enter_email_message) {
        Assert.assertEquals(ConfigReader.getProperty(enter_email_message), registerPage.errorMessage.getText());
    }

    @And("User enter anything to New password text box and presses the enter key")
    public void userEnterAnythingToNewPasswordTextBoxAndPressesTheEnterKey() {
        registerPage.firstPasswordTextBox.sendKeys(Keys.TAB);
    }

    @Then("User should see the New password error message {string} message")
    public void userShouldSeeTheNewPasswordErrorMessageMessage(String enter_new_password_message) {
        Assert.assertEquals(ConfigReader.getProperty(enter_new_password_message), registerPage.errorMessage.getText());
    }

    @And("User enter anything to New password confirmation text box and presses the enter key")
    public void userEnterAnythingToNewPasswordConfirmationTextBoxAndPressesTheEnterKey() {
        registerPage.secondPasswordTextBox.sendKeys(Keys.TAB);
    }

    @Then("User should see the New password confirmation error message {string} message")
    public void userShouldSeeTheNewPasswordConfirmationErrorMessageMessage(String enter_new_password_confirmation_message) {
        Assert.assertEquals(ConfigReader.getProperty(enter_new_password_confirmation_message), registerPage.errorMessage.getText());
    }
}
