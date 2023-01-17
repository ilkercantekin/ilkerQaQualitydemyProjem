package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogInPage {
    public LogInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement buttonLogin;
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailBox;
    @FindBy (xpath = "//*[@id='login-email']")
    public WebElement emailkutusu;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//*[text()='Login'])[2]")
    public WebElement loginButton;
}
