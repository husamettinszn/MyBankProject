package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_003StepDefinitions {
    RegisterPage registerPage = new RegisterPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("User scrolls down the page")
    public void user_scrolls_down_the_page() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @Then("User sees invalid password message {string} und")
    public void user_sees_invalid_password_message_und(String password_should_contain_at_least) {
        Assert.assertEquals(ConfigReader.getProperty(password_should_contain_at_least), registerPage.errorMessage.getText());
    }

    @Then("User sees on the password strenght bar red colour")
    public void user_sees_on_the_password_strenght_bar_red_colour() {
        Assert.assertTrue(registerPage.redBar.isDisplayed());
    }

    @And("User enter to password text box five lowercase {string} and presses tab")
    public void userEnterToPasswordTextBoxFiveLowercaseAndPressesTab(String invalid_password1) {
        registerPage.firstPasswordTextBox.sendKeys(ConfigReader.getProperty(invalid_password1));
        actions.sendKeys(Keys.TAB).perform();
    }
}
