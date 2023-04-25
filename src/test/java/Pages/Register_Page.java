package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register_Page {
    WebDriver driver;

    public Register_Page(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement CheckSignUp()
    {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b"));

    }



    private WebElement getUserName()
    {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));

    }

    private WebElement getEmail()
    {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));

    }

    private WebElement getSignUpButton()
    {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));

    }
    public void SignUp(String UserName , String Email)
    {
        getUserName().sendKeys(UserName);
        getEmail().sendKeys(Email);
        getSignUpButton().click();
    }
    public WebElement VerifyNewUserSignup()
    {
        return driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2"));

    }
    private WebElement getPassword()
    {
        return driver.findElement(By.xpath("//*[@id=\"password\"]"));

    }
    private WebElement getGender(char M)
    {
        if (M=='m'||M=='M')
        return driver.findElement(By.id("id_gender1"));
        else return driver.findElement(By.id("id_gender2"));

    }
    private WebElement getDay()
    {
        return  driver.findElement(By.id("days"));

    }
    private WebElement getMonth()
    {
        return driver.findElement(By.id("months"));

    }
    private WebElement getYear()
    {
        return driver.findElement(By.id("years"));

    }
    public WebElement getSandboxNewsletter()
    {
        return driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));

    }
    public WebElement getSandboxOptin()
    {
        return driver.findElement(By.xpath("//*[@id=\"optin\"]"));

    }


    public void FillAccountInfo(char Gender , String Password , String Day ,String Month , String Year )
    {
        getGender(Gender).click();
        getPassword().sendKeys(Password);
        Select Days = new Select(getDay());
        Days.selectByValue(Day);
        Select Months = new Select(getMonth());
        Months.selectByValue(Month);
        Select Years = new Select(getYear());
        Years.selectByValue(Year);

    }
    private WebElement getFirstName()
    {
        return  driver.findElement(By.id("first_name"));

    }
    private WebElement getSecondName()
    {
        return  driver.findElement(By.id("last_name"));

    }
    private WebElement getCompany()
    {
        return  driver.findElement(By.id("company"));

    }
    private WebElement getAddress1()
    {
        return  driver.findElement(By.id("address1"));

    }
    private WebElement getAddress2()
    {
        return  driver.findElement(By.id("address2"));

    }
    private WebElement getCountry()
    {
        return  driver.findElement(By.id("country"));

    }
    private WebElement getCity()
    {
        return  driver.findElement(By.id("city"));

    }
    private WebElement getState()
    {
        return  driver.findElement(By.id("state"));

    }
    private WebElement getZipcode()
    {
        return  driver.findElement(By.id("zipcode"));

    }
    private WebElement getMobile()
    {
        return  driver.findElement(By.id("mobile_number"));

    }
    private WebElement getCreateAccountButton()
    {
        return  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));

    }
    public void fillAdressInfo(String FName , String LName, String Company , String Add1, String Add2 , String Country ,
                               String State , String City, String ZipCode , String Mobile)
    {
        getFirstName().sendKeys(FName);
        getSecondName().sendKeys(LName);
        getCompany().sendKeys(Company);
        getAddress1().sendKeys(Add1);
        getAddress2().sendKeys(Add2);
        Select Countries = new Select(getCountry());
        Countries.selectByValue(Country);
        getState().sendKeys(State);
        getCity().sendKeys(City);
        getZipcode().sendKeys(ZipCode);
        getMobile().sendKeys(Mobile);
        getCreateAccountButton().click();

    }
    public WebElement getAccountCreatedButton()
    {
        return  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));
    }
    public WebElement getContinueButton()
    {
        return  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
    }


    public WebElement verifyACCOUNTDELETED()
    {
        return  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));

    }





}
