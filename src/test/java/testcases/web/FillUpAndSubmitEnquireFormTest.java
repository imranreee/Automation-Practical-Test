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
    int itrCount = 0;

    @BeforeTest(groups = {"smoke", "regression"})
    public void webSetUp() throws Exception {
        WebSettings webSettings = new WebSettings();
        driver = webSettings.upAndRunWebApp();
    }

    @Test(priority = 1, invocationCount = 2, groups = {"regression"})
    public void fromFillUpAndSubmitTest() throws Exception {
        itrCount += 1;
        grandRevePage = new GrandRevePage(driver);
        grandRevePage.checkAvailabilityEnquireForm();
        grandRevePage.enterName();
        grandRevePage.enterEmail();
        grandRevePage.enterPhone();
        grandRevePage.enterPostCode();
        grandRevePage.selectBuyerType();
        grandRevePage.selectPriceRange();
        grandRevePage.selectDuration();
        grandRevePage.selectContactMethod();
        grandRevePage.selectPreApproval();
        grandRevePage.selectScheduling();
        grandRevePage.selectPriceInfo();
        grandRevePage.selectRequestFloorPlan();
        grandRevePage.selectBrochure();
        grandRevePage.enterMessage("Imran Automation", itrCount);
        grandRevePage.clickSubmitBtn();
        grandRevePage.clickCloseBtn();
    }

    @Test(priority = 2)
    public void moreTest() throws Exception {
        //more test case here
    }
    @Test(priority = 3)
    public void andMoreTest() throws Exception {
        //more test case here
    }

    @AfterTest(groups = {"smoke", "regression"})
    public void endTest(){
        //driver.quit();
    }
}
