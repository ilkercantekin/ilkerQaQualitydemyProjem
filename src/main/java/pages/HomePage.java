package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePage {
    Actions actions=new Actions(Driver.getDriver());
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Accept']")
    private WebElement cookies;
    @FindBy (xpath = "//*[text()='Accept']")
    public WebElement cookieAccept;
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement linkilkLogin;

    @FindBy(xpath = "//a[text()='Log in']")
    private WebElement loginLink;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailBox;
    @FindBy (xpath = "//*[@id='login-email']")
    public WebElement emailkutusu;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordBox;

    @FindBy(xpath = "(//*[text()='Login'])[2]")
    private WebElement loginButton;





    @FindBy(xpath = "//*[text()='Categories']")
    public WebElement categories;
    @FindBy(xpath = "//*[@class='fw-500']")
    public WebElement catagorie;

    @FindBy(xpath = "//a[normalize-space()='Instructor']")
    public WebElement linkInstructor;

    @FindBy(xpath = "//*[text()='My courses']")
    public WebElement linkMyCourses;







    public void loginMethodu(){
        cookies.click();
        loginLink.click();
        emailBox.sendKeys(ConfigReader.getProperty("mail"));
        passwordBox.sendKeys(ConfigReader.getProperty("password"));
        loginButton.click();
    }

}
