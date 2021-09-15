package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement signInDropdownMenu;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement signInLink;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signInButton;

    @FindBy(id = "entity-menu")
    public WebElement myOperations;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement cancelButton;
}
