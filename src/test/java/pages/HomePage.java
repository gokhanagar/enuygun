package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends BasePage{

    @FindBy(css = "a[data-testid='header-nav-links-4']")
    public WebElement transferButton;

    @FindBy(xpath = "//h1[text()='Türkiye’nin Seyahat Sitesi']")
    public WebElement mainTitle;

    @FindBy(css = "button[data-testid='membership-signin-dialog-open-button']")
    public WebElement girisYapButton;

    @FindBy(css = "a[data-testid='header-nav-links-2']")
    public WebElement otobusButton;

    @FindBy(css = "a[data-testid='header-nav-links-0']")
    public WebElement ucakBiletiButton;

    @FindBy(css = "a[data-testid='header-nav-links-3']")
    public WebElement aracButton;

    @FindBy(css = "input[data-testid='endesign-flight-origin-autosuggestion-input']")
    public WebElement ucakBiletiNeredenTextArea;

    @FindBy(css = "button[data-testid='flight-search-history-item-origin-0']")
    public WebElement ucakBiletiNeredenTextButton;


    @FindBy(css = "input[data-testid='endesign-flight-destination-autosuggestion-input']")
    public WebElement ucakBiletiNereyeTextArea;

    @FindBy(css = "button[data-testid='flight-search-history-item-destination-0']")
    public WebElement ucakBiletiNereyeTextButton;


    @FindBy(css = "input[data-testid='enuygun-homepage-flight-departureDate-datepicker-input']")
    public WebElement ucakBiletiGidisTarihiTextArea;

    @FindBy(css = "button[data-testid='enuygun-homepage-flight-submitButton']")
    public WebElement ucakBiletiUcuzBiletBulButton;





}
