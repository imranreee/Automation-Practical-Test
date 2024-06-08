package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.HelperClass;

import java.time.Duration;

public class GrandRevePage extends HelperClass{
    public static WebDriver driver;
    String ranNum;
    By btnEnquireNow = By.xpath("//button[.//span[@class='mat-button-wrapper' and contains(text(),'Enquire now')]]");
    By formEnquire = By.xpath("//form[@name='enquirerFrom']");
    By inputName = By.xpath("//input[@name='name']");
    By inputEmail = By.xpath("//input[@formcontrolname='email']");
    By inputPhone = By.xpath("//input[@id='phone']");
    By inputPostCode = By.xpath("//input[@name='postCode']");
    By dropDownBuyerType = By.xpath("//select[@name='buyerType']");
    By dropDownPriceRange = By.xpath("//select[@name='priceRange']");
    By dropDownBuyerDuration = By.xpath("//select[@name='buyingDuration']");
    By dropDownContactMethod = By.xpath("//select[@name='contactMethod']");
    By dropDownPreApproval = By.xpath("//select[@name='selectPreApproval']");
    By checkBoxScheduling = By.xpath("//input[@name='scheduleInspection']");
    By checkBoxPriceInfo = By.xpath("//input[@name='priceInformation']");
    By checkBoxRequestFloorPlans = By.xpath("//input[@name='requestFloorPlans']");
    By checkBoxBrochure = By.xpath("//input[@name='brochure']");
    By btnAddMessage = By.xpath("//label[text()='Add a message (optional)']");
    By inputOptionalMessage = By.xpath("//textarea[@name='message']");
    By btnSubmitEnquiry = By.xpath("//button[text()='Submit Enquiry']");
    By btnClose = By.xpath("//img[@alt='Close']");

    public GrandRevePage(WebDriver driver){
        super(driver);
        GrandRevePage.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public void checkAvailabilityEnquireForm(){
        waitForClickAbilityOf(btnEnquireNow);
        driver.findElement(btnEnquireNow).click();
        boolean isFoundFrom = driver.findElement(formEnquire).isDisplayed();
        Assert.assertTrue(isFoundFrom);
    }


    public void enterName(){
        waitForClickAbilityOf(inputName);
        driver.findElement(inputName).click();
        driver.findElement(inputName).sendKeys("AL IMRAN");
    }

    public void enterEmail(){
        waitForClickAbilityOf(inputEmail);
        driver.findElement(inputEmail).click();
        ranNum = generateRandomNumber(3);
        driver.findElement(inputEmail).sendKeys("imran"+ranNum+"@test.com");
    }

    public void enterPhone(){
        waitForClickAbilityOf(inputPhone);
        driver.findElement(inputPhone).click();
        ranNum = generateRandomNumber(6);
        driver.findElement(inputPhone).sendKeys("222"+ranNum);
    }

    public void enterPostCode(){
        waitForClickAbilityOf(inputPostCode);
        driver.findElement(inputPostCode).click();
        ranNum = generateRandomNumber(4);
        driver.findElement(inputPostCode).sendKeys(ranNum);
    }

    public void selectBuyerType(){
        waitForClickAbilityOf(dropDownBuyerType);
        selectDropdownByVisibleText(dropDownBuyerType, "First Home Buyers");
    }

    public void selectPriceRange(){
        waitForClickAbilityOf(dropDownPriceRange);
        selectDropdownByIndex(dropDownPriceRange, 1);
    }

    public void selectDuration(){
        waitForClickAbilityOf(dropDownBuyerDuration);
        selectDropdownByIndex(dropDownBuyerDuration, 1);
    }

    public void selectContactMethod(){
        waitForClickAbilityOf(dropDownContactMethod);
        selectDropdownByIndex(dropDownContactMethod, 1);
    }

    public void selectPreApproval(){
        waitForClickAbilityOf(dropDownPreApproval);
        selectDropdownByIndex(dropDownPreApproval, 1);
    }

    public void selectScheduling(){
        waitForClickAbilityOf(checkBoxScheduling);
        driver.findElement(checkBoxScheduling).click();
    }

    public void selectPriceInfo(){
        waitForClickAbilityOf(checkBoxPriceInfo);
        driver.findElement(checkBoxPriceInfo).click();
    }

    public void selectRequestFloorPlan(){
        waitForClickAbilityOf(checkBoxRequestFloorPlans);
        driver.findElement(checkBoxRequestFloorPlans).click();
    }

    public void selectBrochure(){
        waitForClickAbilityOf(checkBoxBrochure);
        driver.findElement(checkBoxBrochure).click();
    }

    public void enterMessage(String message, int itr){
        waitForClickAbilityOf(btnAddMessage);
        driver.findElement(btnAddMessage).click();

        waitForClickAbilityOf(inputOptionalMessage);
        driver.findElement(inputOptionalMessage).click();
        String fullMsg = message+" "+itr;
        driver.findElement(inputOptionalMessage).sendKeys(fullMsg);
    }

    public void clickSubmitBtn(){
        waitForClickAbilityOf(btnSubmitEnquiry);
        driver.findElement(btnSubmitEnquiry).click();
    }

    public void clickCloseBtn(){
        waitForClickAbilityOf(btnClose);
        driver.findElement(btnClose).click();
        waitForClickAbilityOf(btnEnquireNow);
    }

}
