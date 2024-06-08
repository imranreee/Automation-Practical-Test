package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelperClass {
    protected static WebDriver driver;

    public HelperClass(WebDriver driver) {
        HelperClass.driver = driver;
    }
    public void waitForClickAbilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
