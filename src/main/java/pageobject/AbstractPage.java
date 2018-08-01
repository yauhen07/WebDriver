package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    protected void waitForElementVisible(By locator) {
        new WebDriverWait(driver, WAIT_FOR_ELEMENTS_SECONDS).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    protected void highlightElement(By locator){
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.background='#db3737'", driver.findElement(locator));
    }

    protected void unhighlightElement(By locator){
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.background='#FFFF'", driver.findElement(locator));
    }
}