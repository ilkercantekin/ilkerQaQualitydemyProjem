package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyCoursePage {
    public MyCoursePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    MyCoursePage myCoursePage=new MyCoursePage();
    @FindBy(xpath = "//*[text()='My courses']")
    public WebElement mycourses;

    @FindBy(xpath = "//a[@href='https://qa.qualitydemy.com/home/my_wishlist']")
    public WebElement linkWishlists;
}
