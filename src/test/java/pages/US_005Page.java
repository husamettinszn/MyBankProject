package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_005Page {

    public US_005Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement signInDropdown;

    @FindBy(id = "login-item")
    public WebElement signIn;

    @FindBy(id = "username")
    public WebElement username_textBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password_textBox;

    @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement error_message;
}
