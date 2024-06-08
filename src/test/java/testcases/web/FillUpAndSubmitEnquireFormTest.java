package testcases.web;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.web.GrandRevePage;
import utils.WebSettings;

public class FillUpAndSubmitEnquireFormTest{
    public static WebDriver driver;
    GrandRevePage grandRevePage;

    @BeforeTest()
    public void webSetUp() throws Exception {
        WebSettings webSettings = new WebSettings();
        driver = webSettings.upAndRunWebApp();
    }

    @Test(priority = 1)
    public void fromFillUpAndSubmitTest() throws Exception {
        grandRevePage = new GrandRevePage(driver);
        grandRevePage.checkAvailabilityEnquireForm();
        grandRevePage.fillUpTheForm();
    }

    @Test(priority = 2)
    public void moreTest() throws Exception {
        //more test case here
    }

    @AfterTest()
    public void endTest(){
        driver.quit();
    }
}
