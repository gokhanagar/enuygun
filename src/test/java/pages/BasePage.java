package pages;

import pages.arac.AracKiralamaDetayPage;
import pages.arac.AracKiralamaListesiPage;
import pages.arac.AracPage;
import pages.ucak.UcusListesiPage;
import pages.ucak.UcusSeferiPage;
import utility.BrowserUtils;
import utility.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    private HomePage homePage;
    private LoginPage loginPage;
    private UcusListesiPage ucusListesiPage;
    private UcusSeferiPage ucusSeferiPage;
    private AracPage aracPage;
    private AracKiralamaListesiPage aracKiralamaListesiPage;
    private AracKiralamaDetayPage aracKiralamaDetayPage;

    public HomePage homePage() {
        if (homePage == null){
            homePage = new HomePage();
        }
        return homePage;
    }

    public LoginPage loginPage() {
        if (loginPage == null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public UcusListesiPage ucusListesiPage(){
        if(ucusListesiPage == null){
            ucusListesiPage = new UcusListesiPage();
        }
        return ucusListesiPage;
    }

    public UcusSeferiPage ucusSeferiPage(){
        if (ucusSeferiPage == null){
            ucusSeferiPage = new UcusSeferiPage();
        }
        return ucusSeferiPage;
    }

    public AracPage aracPage(){
        if (aracPage == null){
            aracPage = new AracPage();
        }
        return aracPage;
    }

    public AracKiralamaListesiPage aracKiralamaListesiPage(){
        if(aracKiralamaListesiPage == null){
            aracKiralamaListesiPage = new AracKiralamaListesiPage();
        }
        return  aracKiralamaListesiPage;
    }

    public AracKiralamaDetayPage aracKiralamaDetayPage(){
        if(aracKiralamaDetayPage == null){
            aracKiralamaDetayPage = new AracKiralamaDetayPage();
        }
        return aracKiralamaDetayPage;
    }





}