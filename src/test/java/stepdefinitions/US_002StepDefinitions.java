package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;

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
        registerPage.ssnTextBox.sendKeys(Keys.ENTER);
    }

    @Then("User should see {string} message")
    public void user_should_see_message(String ssnMessage) {
        System.out.println(ConfigReader.getProperty(ssnMessage));

        Driver.dr
    }


}
