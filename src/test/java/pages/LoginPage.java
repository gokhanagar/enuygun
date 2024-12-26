package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Driver;

import java.time.Duration;

import static utility.BrowserUtils.*;

public class LoginPage extends BasePage {

    @FindBy(css = "h2[data-testid='signin-form-title']")
    public WebElement girisYapTextPopUp;

    @FindBy(css = "input[data-testid='membership-signin-email-input']")
    public WebElement epostaTextArea;

    @FindBy(css = "input[data-testid='membership-signin-password-input']")
    public WebElement sifreTextArea;

    @FindBy(css = "button[data-testid='membership-signin-submit-button")
    public WebElement girisYapButton;

    @FindBy(css = "button[data-testid='membership-signin-dialog-close-button']")
    public WebElement closeButton;

    @FindBy(css = "div[data-testid='membership-loggedinuser-name']")
    public WebElement userName;



    public void login(String email, String password) {

        Assert.assertTrue(homePage().mainTitle.isDisplayed());
        clickWithJS(Driver.getDriver().findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
        clickWithJS(homePage().girisYapButton);

        waitForVisibility(girisYapTextPopUp,5);
        Assert.assertEquals("Giriş Yap",girisYapTextPopUp.getText());

        epostaTextArea.sendKeys(email);
        sifreTextArea.sendKeys(password);
        clickWithJS(girisYapButton);
        waitForVisibility(userName,5);
        System.out.println(userName.getText());

        Assert.assertTrue(userName.isDisplayed());

    }


}