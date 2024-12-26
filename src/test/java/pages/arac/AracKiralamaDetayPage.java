package pages.arac;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AracKiralamaDetayPage extends BasePage {

    @FindBy(css = "h4[data-testid='deliveryInformation-title']")
    public WebElement aracTeslimBilgileriText;

    @FindBy(css = "button[data-testid='weg-arrow-forward']")
    public WebElement devamEtButton;

    @FindBy(css = "input[data-testid='driverName']")
    public WebElement surucuIsmiInput;

    @FindBy(css = "input[data-testid='driverLastName']")
    public WebElement surucuSoyIsmiInput;

    @FindBy(css = "div[class='sc-b56c04b9-1 efTDRv']")
    public WebElement surucuBilgileriText;

















}
