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
import utilities.ReusableMethods;

public class US_003StepDefinitions {
    RegisterPage registerPage = new RegisterPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("User scrolls down the page")
    public void user_scrolls_down_the_page() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }
    @And("User enters to password text a password {string} that contains six character, at leats an uppercase a digit aspecial character")
    public void userEntersToPasswordTextAPasswordThatContainsSixCharacterAtLeatsAnUppercaseADigitAspecialCharacter(String invalid_password1) {

        registerPage.firstPasswordTextBox.sendKeys(ConfigReader.getProperty(invalid_password1));
    }

    @And("user sees not last green bar")
    public void userSeesNotLastGreenBar() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(registerPage.fifthBarGrau.isDisplayed());
    }

    @And("user enters a lowercase {string} character")
    public void userEntersALowercaseCharacter(String lowerCase) {
        registerPage.firstPasswordTextBox.sendKeys(ConfigReader.getProperty(lowerCase));
    }

    @Then("user sees last green bar")
    public void userSeesLastGreenBar() {
        Assert.assertTrue(registerPage.fifthBarGreen.isDisplayed());
    }


}
