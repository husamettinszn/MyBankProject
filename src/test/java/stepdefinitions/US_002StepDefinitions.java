package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class US_002StepDefinitions {

    RegisterPage registerPage = new RegisterPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("User goes to {string} Homepage")
    public void userGoesToHomepage(String GmiBank_url) {
        Driver.getDriver().get(ConfigReader.getProperty(GmiBank_url));
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

    @And("User enter {string} to SSN textbox.")
    public void userEnterToSSNTextbox(String invalid_ssn) {
        registerPage.ssnTextBox.sendKeys(ConfigReader.getProperty(invalid_ssn));
    }

    @And("User preses Tab key.")
    public void userPresesTabKey() {
        actions.sendKeys(Keys.TAB).perform();

    }

    @Then("User sees invalid Ssn message {string}")
    public void userSeesInvalidSsnMessage(String invalid_ssn_message) {
        System.out.println(registerPage.errorMessage.getText());
        Assert.assertEquals(ConfigReader.getProperty(invalid_ssn_message), registerPage.errorMessage.getText());

    }

    @And("User enter {string} to Phone number text box.")
    public void userEnterToPhonNumberTextBox(String invalid_phone_nummer) {
        registerPage.mobilephoneTextBox.sendKeys(ConfigReader.getProperty(invalid_phone_nummer));

    }

    @Then("User sees invalid phone number message {string}")
    public void userSeesInvalidPhoneNumberMessage(String invalid_phone_number_message) {
       Assert.assertEquals(ConfigReader.getProperty(invalid_phone_number_message), registerPage.errorMessage.getText());
    }

    @And("User enter {string} to email text box")
    public void userEnterToEmailTextBox(String invalid_email) {
        registerPage.emailTextBox.sendKeys(ConfigReader.getProperty(invalid_email));
    }

    @Then("User sees invalid email message {string}")
    public void userSeesInvalidEmailMessage(String invalid_email_message) {
        System.out.println(registerPage.errorMessage.getText());
        Assert.assertEquals(ConfigReader.getProperty(invalid_email_message), registerPage.errorMessage.getText());
    }
}
