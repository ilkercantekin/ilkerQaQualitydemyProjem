package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualityDemy_Page;
import utilities.Driver;
import utilities.ReusableMethods;

public class QDtest2benyaptim {
    //qualityDemy web sayfasina gidin
    // cookies i kabul edin
    // login linkine tiklayin
    // email ve password bilgilerini girerek login butonuna tiklayin
    // categories dropdown dan all courses secenegine tiklayin
    // acilan sayfada olan derslerden The English Master Course dersine tiklayin
    // dersi satin almak icin Buy now secenegine ve checkout butonuna tiklayin
    // stripe secenegini secerek pay with stripe e tiklayin
    // Email,card information gun ay yil cvc ve name on card bilgilerini doldurarak pay a tiklayin
    public QualityDemy_Page qualityDemyPage=new QualityDemy_Page();
    public Actions actions=new Actions(Driver.getDriver());
    @Test
    public void test01() {
        //qualityDemy web sayfasina gidin
        Driver.getDriver().get("https://www.qualitydemy.com");
        // cookies i kabul edin
        actions.click(qualityDemyPage.cookieAccept).perform();
        // login linkine tiklayin
        qualityDemyPage.loginlinki.click();

        // email ve password bilgilerini girerek login butonuna tiklayin
        // giris olmlu mu kontrol edin
        qualityDemyPage.emailkutusu.click();
        qualityDemyPage.emailkutusu.sendKeys("rayder.beau@falltrack.net");
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Baba123456").perform();
        qualityDemyPage.loginbutonu.click();
        Assert.assertTrue(qualityDemyPage.mycourss.isDisplayed());
        // categories dropdown dan all courses secenegine tiklayin
        qualityDemyPage.catagoriei.click();
        // acilan sayfada olan derslerden The English Learn dersine tiklayin
        qualityDemyPage.englishCours.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        qualityDemyPage.learnEnglishCourse.click();
        // dersin eklendigini test edin
        qualityDemyPage.mycourss.click();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(qualityDemyPage.englishSpeaking.isDisplayed());

    }

}
