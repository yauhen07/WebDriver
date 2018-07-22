package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Help {

    public static void clearAndInput(WebDriver driver, By locator, String input) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(input);
    }

    public static void selectValueFromDropdownAppForm(WebDriver driver, By locatorDropdown, By locatorList, String valueToSelect, String attribute) {
        WebElement element;
        String innerComp;
        driver.findElement(locatorDropdown).click();
        List<WebElement> businessNatureDropdown = driver.findElements(locatorList);
        for (int i = 0; i < businessNatureDropdown.size(); i++) {
            element = businessNatureDropdown.get(i);
            innerComp = element.getAttribute(attribute);
            if (innerComp.contentEquals(valueToSelect)) {
                element.click();
                break;
            }
        }
    }
}
