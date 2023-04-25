package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pages {

    WebDriver driver;

    public Pages(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement getSignup_LoginButton()
    {
        return driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));

    }
    public WebElement getLoggedButton()
    {
        return  driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
    }
    public WebElement getDeleteButton()
    {
        return  driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
    }
}
