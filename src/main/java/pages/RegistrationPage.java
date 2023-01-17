package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {

    RegistrationPage registrationPage=new RegistrationPage();
    @FindBy(xpath = "(//a[text()='Sign Up'])[1]")
    public WebElement linkSingUp;

}
