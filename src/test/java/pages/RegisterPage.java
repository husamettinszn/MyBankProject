package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {
    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement dropdownMenu;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement register;

    @FindBy(name = "ssn")
    public WebElement ssnTextBox;

    @FindBy(name = "firstname")
    public WebElement firstnameTextBox;

    @FindBy(name = "lastname")
    public WebElement lastnameTextBox;

    @FindBy(name = "address")
    public WebElement addressTextBox;

    @FindBy(name = "mobilephone")
    public WebElement mobilephoneTextBox;

    @FindBy(name = "username")
    public WebElement usernameTextBox;

    @FindBy(name = "email")
    public WebElement emailTextBox;

    @FindBy(name = "firstPassword")
    public WebElement firstPasswordTextBox;

    @FindBy(name = "secondPassword")
    public WebElement secondPasswordTextBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement errorMessage;

    @FindBy(xpath = "(//li[@style='background-color: rgb(255, 255, 0);'])[1]")
    public WebElement firstBar;

    @FindBy(xpath = "(//li[@style='background-color: rgb(255, 255, 0);'])[2]")
    public WebElement secondBar;

    @FindBy(xpath = "(//li[@style='background-color: rgb(255, 255, 0);'])[3]")
    public WebElement thirdBar;

    @FindBy(xpath = "(//li[@style='background-color: rgb(255, 255, 0);'])[4]")
    public WebElement fourthBar;

    @FindBy(xpath = "(//li[@style='background-color: rgb(0, 255, 0);'])[5]")
    public WebElement fifthBarGreen;

    @FindBy(xpath = "(//li[@style='background-color: rgb(221, 221, 221);'])[2]")
    public WebElement fifthBarGrau;


}

