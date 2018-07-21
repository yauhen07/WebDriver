package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
    protected WebDriver driver;
    private static final int WAIT_FOR_ELEMENTS_SECONDS = 10;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    protected void waitForElementPresent(By locator) {
        new WebDriverWait(driver, WAIT_FOR_ELEMENTS_SECONDS).until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
}
