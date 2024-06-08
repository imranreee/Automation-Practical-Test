package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utils.HelperClass;

import java.time.Duration;

public class GrandRevePage extends HelperClass{
    public static WebDriver driver;
    By btnEnquireNow = By.xpath("//button[.//span[@class='mat-button-wrapper' and contains(text(),'Enquire now')]]");
    By formEnquire = By.xpath("//form[@name='enquirerFrom']");
    By inputName = By.xpath("//input[@name='name']");
    By inputEmail = By.xpath("//input[@formcontrolname='email']");
    By inputPhone = By.xpath("//input[@id='phone']");
    By inputPostCode = By.xpath("//input[@name='postCode']");
    //WebElement dropdownDescribeBest = driver.findElement(By.id("mat-input-39"));
    //HelperClass helperClass = new HelperClass(driver);

    public GrandRevePage(WebDriver driver){
        super(driver);
        GrandRevePage.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public void checkAvailabilityEnquireForm(){
        boolean isFoundFrom = driver.findElement(formEnquire).isDisplayed();
        Assert.assertTrue(isFoundFrom);
    }


    public void fillUpTheForm(){
        waitForClickAbilityOf(btnEnquireNow);
        driver.findElement(btnEnquireNow).click();

        driver.findElement(inputName).click();
        driver.findElement(inputName).sendKeys("AL IMRAN");

       /*Select select = new Select(dropdownDescribeBest);
        select.selectByVisibleText("First Home Buyers");*/
        // Alternatively, you can select by value or index
        // select.selectByValue("desired_value");
        // select.selectByIndex(1); // Index starts from 0
    }
}
