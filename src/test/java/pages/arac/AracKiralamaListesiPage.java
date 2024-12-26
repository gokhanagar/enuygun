package pages.arac;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AracKiralamaListesiPage extends BasePage {

    @FindBy(css = "span[data-testid='car-rental-editSearch-dropOffLocation']")
    public WebElement aracAlimYeriText;

    @FindBy(xpath = "//button[contains(@data-testid, 'rentNow_button')]")
    public WebElement ilkAracHemenKiralaButton;






















}
