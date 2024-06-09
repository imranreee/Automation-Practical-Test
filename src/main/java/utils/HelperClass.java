package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class HelperClass {
    protected static WebDriver driver;

    public HelperClass(WebDriver driver) {
        HelperClass.driver = driver;
    }
    public void waitForClickAbilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public static String generateRandomNumber(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be a positive number.");
        }

        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append(random.nextInt(9) + 1);

        for (int i = 1; i < length; i++) {
            sb.append(random.nextInt(10));
        }

        return sb.toString();
    }

    public void selectDropdownByVisibleText(By dropdownLocator, String visibleText) {
        WebElement dropdownElement = driver.findElement(dropdownLocator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
    }

    public void selectDropdownByIndex(By dropdownLocator, int index) {
        WebElement dropdownElement = driver.findElement(dropdownLocator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(index);
    }

    public void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
