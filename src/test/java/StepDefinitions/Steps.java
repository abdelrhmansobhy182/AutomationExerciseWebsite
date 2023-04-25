package StepDefinitions;

import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import java.util.Arrays;


public class Steps {


    public static WebDriver GlobalDriver = null;
    Pages Page;
    @Given("Navigate to Website")
    public void OpenBrowser() throws InterruptedException {
        String ChromPath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChromPath);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        GlobalDriver= new ChromeDriver(options);
        GlobalDriver.navigate().to("https://automationexercise.com/");
        GlobalDriver.manage().window().maximize();
        Thread.sleep(1000);
        Page =new Pages(GlobalDriver);
        Hooks.driver=GlobalDriver;

    }

    @When("Click on Signup Login button")
    public void ClickOnSignUP() throws InterruptedException {
        Page.getSignup_LoginButton().click();
        Thread.sleep(1000);
    }
    @And("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() throws InterruptedException {
        Boolean Verify = Page.getLoggedButton().isDisplayed();
        Assert.assertTrue(Verify);
        Thread.sleep(1000);
    }
    @And("Click Delete Account button")
    public void clickDeleteAccountButton() throws InterruptedException {
        Page.getDeleteButton().click();
        Thread.sleep(1000);
    }
}
