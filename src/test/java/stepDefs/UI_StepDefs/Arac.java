package stepDefs.UI_StepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import pages.BasePage;


import static utility.BrowserUtils.*;

public class Arac extends BasePage {

    @When("Kullanici arac kiralama icin alis yeri tarih ve saat bilgilerini girer")
    public void kullaniciAracKiralamaIcinAlisYeriTarihVeSaatBilgileriniGirer() throws InterruptedException {
        clickWithJS(homePage().aracButton);
        waitForVisibility(aracPage().teslimAlisYeriInputArea, 5);

        aracPage().teslimAlisYeriInputArea.sendKeys("Eskişehir");
        Thread.sleep(2000);
        aracPage().teslimAlisYeriInputArea.sendKeys(Keys.ENTER);

        clickWithJS(aracPage().aracBulButton);

    }

    @And("Kullanici gunluk arac kiralama listesinden bir arac secer")
    public void kullaniciGunlukAracKiralamaListesindenBirAracSecer() throws InterruptedException {

        waitForVisibility(aracKiralamaListesiPage().ilkAracHemenKiralaButton,20);
        Assert.assertTrue(aracKiralamaListesiPage().aracAlimYeriText.isDisplayed());
        aracKiralamaListesiPage().ilkAracHemenKiralaButton.click();

    }

    @Then("Kullanici arac kiralama ek hizmet ve guvence sayfasina yonlendirilir")
    public void kullaniciAracKiralamaEkHizmetVeGuvenceSayfasinaYonlendirilir() {

        waitForVisibility(aracKiralamaDetayPage().aracTeslimBilgileriText, 10);
        Assert.assertTrue((aracKiralamaDetayPage().aracTeslimBilgileriText.isDisplayed()));

        clickWithJS(aracKiralamaDetayPage().devamEtButton);
    }

    @And("Kullanici arac kiralama surucu bilgilerini girer")
    public void kullaniciAracKiralamaSurucuBilgileriniGirer() throws InterruptedException {

        waitForVisibility(aracKiralamaDetayPage().surucuBilgileriText,5);
        Assert.assertTrue(aracKiralamaDetayPage().surucuBilgileriText.isDisplayed());

        waitForVisibility(aracKiralamaDetayPage().surucuIsmiInput,5);
        Thread.sleep(1000);
        aracKiralamaDetayPage().surucuIsmiInput.sendKeys("Bu, 50 karakterden daha uzun bir test metnidir. Lorem ipsum" + Keys.ENTER);

        aracKiralamaDetayPage().surucuSoyIsmiInput.sendKeys("Bu, 50 karakterden daha uzun bir test metnidir. Lorem ipsum "+ Keys.ENTER);

        String actualNameValue = aracKiralamaDetayPage().surucuIsmiInput.getAttribute("value");

        if (actualNameValue.length() <= 50) {
            System.out.println("Input alanı maksimum 50 karakter alıyor: " + actualNameValue.length());
        } else {
            System.out.println("Input alanı 50 karakterden fazla alıyor: " + actualNameValue.length());
            Assert.assertTrue("Karakter sınırı aşılmış! Beklenen: <=50",  + actualNameValue.length() <= 50);
        }

    }
}
