package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utility.BrowserUtils;
import utility.Driver;


public class Hooks {
    WebDriver driver;
    public static BasePage basePage;
    public static boolean isFullScreen = true;
    public static int width;
    public static int height;
    public static boolean isHeadless = false;
    public static String browserType = "chrome";

    @Before(value = "@headless", order = 0)
    public void setIsHeadless() {
        isHeadless = true;
    }

    @Before(value = "@firefox", order = 0)
    public void setIsFirefox() {
        browserType = "firefox";
    }


    @Before(value = "@iPhone12", order = 0)
    public void setiPhone12() {
        isFullScreen = false;
        width = 390;
        height = 844;
    }


    @Before(order = 1)
    public void setup() {

        driver = Driver.getDriver();
        basePage = new BasePage() {};
        driver.manage().deleteAllCookies();
    }


    @After
    public void teardownMethod(Scenario scenario){

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        BrowserUtils.waitFor(2);
        Driver.closeDriver();

    }
}
