package pages.ucak;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class UcusSeferiPage extends BasePage {

    @FindBy(css = "div[data-testid='reservationTitleMulti']")
    public WebElement reservationTitle;

    @FindBy(xpath = "//div[@class='custom-btn-container']//div[@class='reservationButton']")
    public WebElement reservationButton;













}
