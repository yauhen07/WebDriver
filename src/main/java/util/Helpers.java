package util;

import core.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static core.WebDriverSingleton.getWebDriverInstance;

public class Helpers {

    public static void clearAndInput(By locator, String input) {
        getWebDriverInstance().findElement(locator).clear();
        getWebDriverInstance().findElement(locator).sendKeys(input);
    }

    public static void selectValueFromDropdownAppForm(By locatorDropdown, By locatorList, String valueToSelect, String attribute) {
        String innerComp;
        getWebDriverInstance().findElement(locatorDropdown).click();
        List<WebElement> businessNatureDropdown = getWebDriverInstance().findElements(locatorList);
        for (WebElement aBusinessNatureDropdown : businessNatureDropdown) {
            innerComp = aBusinessNatureDropdown.getAttribute(attribute);
            if (innerComp.contentEquals(valueToSelect)) {
                aBusinessNatureDropdown.click();
                break;
            }
        }
    }

    public static void clearAndInputAction(By locator, String input) {
        WebElement inputField = getWebDriverInstance().findElement(locator);
        new Actions(getWebDriverInstance().getDriver()).sendKeys(inputField, Keys.CLEAR).build().perform();
        new Actions(getWebDriverInstance().getDriver()).sendKeys(inputField, input).build().perform();
    }

    public static void clickButtonAction(By locator) {
        WebElement loginButton = getWebDriverInstance().findElement(locator);
        new Actions(getWebDriverInstance().getDriver()).click(loginButton).build().perform();
    }
}

