package testcases.web;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.web.EnquirePage;
import utils.WebSettings;

public class FillUpAndSubmitEnquireFormTest{
    public static WebDriver driver;
    EnquirePage enquirePage;

    @BeforeTest()
    public void webSetUp() throws Exception {
        WebSettings webSettings = new WebSettings();
        driver = webSettings.upAndRunWebApp();
    }

    @Test(priority = 1)
    public void googleSearch() throws Exception {
        enquirePage = new EnquirePage(driver);
        enquirePage.findAndSendSearchKey();
    }

    @AfterTest()
    public void endTest(){
        driver.quit();
    }
}
