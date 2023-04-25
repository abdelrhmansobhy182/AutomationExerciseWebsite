package StepDefinitions;

import Pages.Login_Page;
import Pages.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class Login_Steps {

    Login_Page Login;



    @Then("Verify Login To Your Account is Visible")
    public void VerifyButton() throws InterruptedException {
        Login = new Login_Page(Steps.GlobalDriver);
        Boolean Verify = Login.VerifyLoginToYourAccount().isDisplayed();
        Assert.assertTrue(Verify);
        Thread.sleep(1000);


    }

    @And("Enter {string} and {string} and Click Login button")
    public void enterAndAndClickLoginButton(String arg0, String arg1) throws InterruptedException {
        Login.login(arg0, arg1);
        Thread.sleep(1500);
    }

    @Then("Verify that ACCOUNT DELETED is visible")
    public void verifyThatACCOUNTDELETEDIsVisible() throws InterruptedException {
        Boolean Verify = Login.verifyACCOUNTDELETED().isDisplayed();
        Assert.assertTrue(Verify);
        Thread.sleep(1000);
    }


    @Then("Verify error Your email or password is incorrect is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Boolean Verify = Login.verifyLoginError().isDisplayed();
        Assert.assertTrue(Verify);    }
}
