package core;

import logging.CustomLogger;
import org.openqa.selenium.*;

import java.util.List;
import java.util.Set;

public class CustomWebDriver implements WebDriver, JavascriptExecutor, TakesScreenshot {
    private static final String RED_COLOR = "'#db3737'";
    public WebDriver driver;
    public JavascriptExecutor javascriptExecutor;
    public TakesScreenshot takesScreenshot;


    public CustomWebDriver(WebDriver driver) {
        CustomLogger.info("Custom web driver is used");
        this.driver = driver;
    }

    public void get(String s) {
        driver.get(s);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    public WebElement findElement(By by) {
        CustomLogger.info("Find element by" + by.toString());
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.background=" + RED_COLOR, driver.findElement(by));
        return driver.findElement(by);
    }

    public String getPageSource() {
        return driver.getPageSource();
    }

    public void close() {
        driver.close();
    }

    public void quit() {
        CustomLogger.info("Browser was closed");
        driver.quit();
    }

    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    public TargetLocator switchTo() {
        return driver.switchTo();
    }

    public Navigation navigate() {
        return driver.navigate();
    }

    public Options manage() {
        return driver.manage();
    }

    public Object executeScript(String s, Object... objects) {
        return javascriptExecutor.executeScript(s, objects);
    }

    public Object executeAsyncScript(String s, Object... objects) {
        return javascriptExecutor.executeAsyncScript(s, objects);
    }

    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return takesScreenshot.getScreenshotAs(outputType);
    }
}
