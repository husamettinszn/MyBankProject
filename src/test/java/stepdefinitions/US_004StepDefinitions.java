package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_004StepDefinitions {

    LoginPage loginPage = new LoginPage();


    @When("user goes home page {string}")
    public void userGoesHomePage(String GMIBank_Url) {
        Driver.getDriver().get(ConfigReader.getProperty(GMIBank_Url));
    }

    @When("user clicks Sign in dropdown menu")
    public void user_clicks_sign_in_dropdown_menu() {
        loginPage.signInDropdownMenu.click();
    }

    @When("user clicks Sign in link")
    public void user_clicks_sign_in_link() {
        loginPage.signInLink.click();
    }

    @And("user enter a {string} to username textbox")
    public void userEnterAToUsernameTextbox(String valid_username) throws InterruptedException {
        loginPage.userNameTextBox.sendKeys(ConfigReader.getProperty(valid_username));
    }

    @And("user enters a {string} to password textbox")
    public void userEntersAToPasswordTextbox(String valid_password) {
        loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty(valid_password));
    }

    @And("user clicks Sign In button")
    public void userClicksSignInButton() throws InterruptedException {
        loginPage.signInButton.click();

        Thread.sleep(3000);
    }
    @Then("user sees My Operations link")
    public void user_sees_my_operations_link() {
        Assert.assertTrue(loginPage.myOperations.isDisplayed());
    }


    @Then("user sees  Sign In dropdown link")
    public void userSeesSignInDropdownLink() {
        Assert.assertTrue(loginPage.signInDropdownMenu.isDisplayed());

    }

    @And("user clicks Cancel button")
    public void userClicksCancelButton() {
        loginPage.cancelButton.click();
    }
}
