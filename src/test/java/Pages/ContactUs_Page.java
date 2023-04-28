package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ContactUs_Page {

    WebDriver driver;

    public ContactUs_Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getContactButton()
    {

        return driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a"));

    }
    private WebElement getName()
    {

        return driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input"));

    }
    private WebElement getEmail()
    {

        return driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input"));

    }
    private WebElement getSubject()
    {

        return driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input"));

    }
    private WebElement getMessage()
    {

        return driver.findElement(By.xpath("//*[@id=\"message\"]"));

    }
    public WebElement getFile()
    {

        return driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[5]/input"));

    }
    public WebElement getSubmitButton()
    {

        return driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input"));

    }
    public void submitForm(String Name, String Email, String Subject, String Message)
    {
        getName().sendKeys(Name);
        getEmail().sendKeys(Email);
        getSubject().sendKeys(Subject);
        getMessage().sendKeys(Message);

    }

    public WebElement verifyGetInTouch()
    {

        return driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2"));

    }

    public WebElement verifySubmittedSuccessfully()
    {

        return driver.findElement(By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]"));

    }

    public WebElement getBackButton()
    {

        return driver.findElement(By.xpath("//*[@id=\"form-section\"]/a"));

    }

}
