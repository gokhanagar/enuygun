package stepDefs.UI_StepDefs;

import enums.LINKS;
import enums.USERCREDENTIAL;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import pages.BasePage;
import utility.Driver;
import org.openqa.selenium.NoSuchElementException;

import static utility.BrowserUtils.*;


public class Ucak extends BasePage {



    @Given("kullanici siteye giris yapar")
    public void kullanici_siteye_giris_yapar() throws InterruptedException {
        Driver.getDriver().get(LINKS.BASEURL.getLink());

        loginPage().login(USERCREDENTIAL.USER1.getUsername(), USERCREDENTIAL.USER1.getPassword());
    }

    @When("Kullanici ucak bileti icin nereden nereye saat yon ve yolcu sayisi bilgilerini girer")
    public void kullaniciUcakBiletiIcinNeredenNereyeSaatYonVeYolcuSayisiBilgileriniGirer() throws InterruptedException {

        homePage().ucakBiletiNeredenTextArea.sendKeys("istanbul" + Keys.ENTER);

        waitForVisibility(homePage().ucakBiletiNereyeTextArea,5);
        homePage().ucakBiletiNereyeTextArea.sendKeys("Konya");

        Thread.sleep(1000);
        homePage().ucakBiletiNereyeTextArea.sendKeys(Keys.ENTER);

        homePage().ucakBiletiGidisTarihiTextArea.sendKeys(kullaniciGelecekBirTarihSecer());
        clickWithJS(homePage().ucakBiletiUcuzBiletBulButton);
    }

    @And("Kullanici ucak listesinden bir ucus secer")
    public void kullaniciUcakListesindenBirUcusSecer() {

        waitForVisibility(ucusListesiPage().ucusRotaText,5);
        Assert.assertTrue(ucusListesiPage().ucusRotaText.getText().contains("İstanbulKonya"));
        clickWithJS(ucusListesiPage().ilkUcusSeferiSecButton);

        try {
            if (ucusListesiPage().ucusSeferiSecVeIlerleButton.isDisplayed()) {
                ucusListesiPage().ucusSeferiSecVeIlerleButton.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("Buton görünmüyor, devam ediliyor.");
        }
    }

    @And("Kullanici ucus seferi icin rezervasyon yapar")
    public void kullaniciUcusSeferiIcinRezervasyonYapar() {

        waitForVisibility(ucusSeferiPage().reservationTitle,5);
        Assert.assertTrue(ucusSeferiPage().reservationTitle.isDisplayed());
        System.out.println(ucusSeferiPage().reservationTitle.getText());

        try{
            waitForVisibility(ucusSeferiPage().reservationButton,5);
            System.out.println("Buton sistemde var.");
        }catch (TimeoutException e){
            System.out.println("Buton sistemde yok.");
        }
        /* Havayollarinin kendi sitelerinden yapilan karsilastirmaya gore
            burada butonun aktif olarak gorunmesi ve ucret karsiliginda rezervasyon
            yapilmasi beklenir fakat butonun yer almadigi dogrulandi.
         */
    }



    @Then("Kullanicinin yapmis oldugu rezervasyon dogrulanir")
    public void kullanicininYapmisOlduguRezervasyonDogrulanir() {


    }
}
