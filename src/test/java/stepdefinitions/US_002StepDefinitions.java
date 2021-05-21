package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
        Thread.sleep(2000);
        registerPage.register.click();
    }

    @Given("User clicks on the SSN text box")
    public void user_clicks_on_the_ssn_text_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User enter anything to SSN text box and presses the enter key")
    public void user_enter_anything_to_ssn_text_box_and_presses_the_enter_key() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should see {string} message")
    public void user_should_see_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
