package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    WebDriver driver;

    public Login_Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public WebElement VerifyLoginToYourAccount()
    {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));

    }

    private WebElement getEmail()
    {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));

    }
    private WebElement getPassword()
    {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));

    }
    private WebElement getLoginButton()
    {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));

    }

    public void login(String Email , String Password)
    {
        getEmail().sendKeys(Email);
        getPassword().sendKeys(Password);
        getLoginButton().click();
    }

    public WebElement verifyACCOUNTDELETED()
    {
        return  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));

    }
    public WebElement verifyLoginError()
    {
        return  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p"));

    }

}
