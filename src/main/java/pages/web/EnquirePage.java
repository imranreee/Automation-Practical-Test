package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

public class EnquirePage {
    public static WebDriver driver;
    By inputSearchField = By.xpath("//textarea[@id='APjFqb']");
    By btnHome = By.xpath("//a[text()='Home']");

    public EnquirePage(WebDriver driver){
        EnquirePage.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    public void findAndSendSearchKey(){
        driver.findElement(inputSearchField).click();
        driver.findElement(inputSearchField).sendKeys("https://www.ad-group.com.au/");
        boolean isFoundHomePage = driver.findElement(btnHome).isDisplayed();
        Assert.assertTrue(isFoundHomePage);
    }
}
