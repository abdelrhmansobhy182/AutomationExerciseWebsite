package StepDefinitions;

import Pages.ContactUs_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.io.File;

import static StepDefinitions.Hooks.driver;

public class ContactUs_Step {
    ContactUs_Page Contact = new ContactUs_Page(Steps.GlobalDriver);
    @And("Click on Contact Us button")
    public void clickOnContactUsButton() throws InterruptedException {
        Contact.getContactButton().click();
        Thread.sleep(1000);
    }

    @And("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() throws InterruptedException {
        Boolean Verify = Contact.verifyGetInTouch().isDisplayed();
        Assert.assertTrue(Verify);
        Thread.sleep(1000);
    }

    @And("Enter name, email, subject and message")
    public void enterNameEmailSubjectAndMessage() throws InterruptedException {
        Contact.submitForm("Abdelrahman Sobhy","abdo@gmail.com","Subject","Message");
        Thread.sleep(1000);
    }

    @And("Upload file And Submit")
    public void uploadFileAndSubmit() throws InterruptedException {
        File file = new File("./Screenshot.png");
        Contact.getFile().sendKeys(file.getAbsolutePath());
        Thread.sleep(2000);
        Contact.getSubmitButton().click();
        Thread.sleep(1000);

    }

    @And("Click Ok Button")
    public void clickOkButton() throws InterruptedException {
        Steps.GlobalDriver.switchTo().alert().accept();
        Thread.sleep(1000);


    }



    @Then("Verify success message Success Your details have been submitted successfully is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible() throws InterruptedException {
        Boolean Verify = Contact.verifySubmittedSuccessfully().isDisplayed();
        Assert.assertTrue(Verify);
        Thread.sleep(1000);
    }


    @Then("Click Home button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully() throws InterruptedException {
        Contact.getBackButton().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
        Thread.sleep(1000);
        Assert.assertEquals(Steps.GlobalDriver.getCurrentUrl(),"https://automationexercise.com/");


    }
}
