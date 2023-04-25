package StepDefinitions;

import Pages.Login_Page;
import Pages.Register_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_Steps {
    Register_Page Register;


    @And("Verify 'New User Signup!' is visible")
    public void VerifyButton() throws InterruptedException {
        Register = new Register_Page(Steps.GlobalDriver);
        Boolean Verify = Register.VerifyNewUserSignup().isDisplayed();
        System.out.println(Verify);
        Assert.assertTrue(Verify,"New User Signup is visible");
        Thread.sleep(1000);


    }
    //*[@id="form"]/div/div/div/div[1]/h2/b
    @And("Enter name and email address and Click 'Signup' button")
    public void SignUp() throws InterruptedException {
        Register.SignUp("abd", "abcd1811278@gmail.com");
        Thread.sleep(1000);
        Boolean Verify = Register.CheckSignUp().isDisplayed();
        Assert.assertTrue(Verify,"New User Signup is visible");
        Thread.sleep(2000);


    }
    @And("Fill Account Information")
    public void FillAccountInfo() throws InterruptedException {
        Register.FillAccountInfo('M',"123","18","2","2000");
        Register.getSandboxNewsletter().click();
        Register.getSandboxOptin().click();
        Thread.sleep(1000);
    }
    @And("Fill Address Information")
    public void FillAddressInfo() throws InterruptedException {
        Register.fillAdressInfo("Abdelrahman","Sobhy","Orange","Shobra" , "basos" ,
                "Singapore" ,"qalubia","Cairo","12345","01124542365"  );
        Thread.sleep(1000);
    }


    @And("Verify that ACCOUNT CREATED")
    public void verifyThatACCOUNTCREATED() throws InterruptedException {
        Boolean Verify = Register.getAccountCreatedButton().isDisplayed();
        Assert.assertTrue(Verify,"New User Signup is visible");
        Thread.sleep(2000);

    }

    @And("Click Continue button")
    public void clickContinueButton() {
        Register.getContinueButton().click();
    }



    @Then("Verify that ACCOUNT DELETED is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() throws InterruptedException {
        Boolean Verify = Register.verifyACCOUNTDELETED().isDisplayed();
        Assert.assertTrue(Verify);
        Thread.sleep(1000);
        Register.getContinueButton().click();
        Thread.sleep(3000);

    }
}
