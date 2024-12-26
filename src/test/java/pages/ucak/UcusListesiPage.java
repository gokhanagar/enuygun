package pages.ucak;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class UcusListesiPage extends BasePage {

    @FindBy(xpath = "//div[@class='searchFormGraphic col tr']//strong[@class='graphic-strong']")
    public WebElement ucusRotaText;

    @FindBy(xpath = "//div[@id='flight-0']//button[@class='action-select-btn tr btn btn-success btn-sm']")
    public WebElement ilkUcusSeferiSecButton;

    @FindBy(css = "button[data-testid='providerSelectBtn']")
    public WebElement ucusSeferiSecVeIlerleButton;































}
