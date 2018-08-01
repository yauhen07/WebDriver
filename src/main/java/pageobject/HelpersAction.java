package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HelpersAction {

    public static void clearAndInput(WebDriver driver, By locator, String input) {
        WebElement inputField = driver.findElement(locator);
        new Actions(driver).sendKeys(inputField, Keys.CLEAR).build().perform();
        new Actions(driver).sendKeys(inputField, input).build().perform();
    }
}
