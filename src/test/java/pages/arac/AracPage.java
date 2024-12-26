package pages.arac;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AracPage extends BasePage {


    @FindBy(css = "input[data-testid='endesign-car-rental-pickUpLocation-autosuggestion-input']")
    public WebElement teslimAlisYeriInputArea;

    @FindBy(css = "input[data-testid='car-rental-pickUpDate-datepicker-input']")
    public WebElement teslimAlisTarihiInputArea;

    @FindBy(css = "button[data-testid='car-rental-search-button']")
    public WebElement aracBulButton;


}




