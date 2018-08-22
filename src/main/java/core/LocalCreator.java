package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalCreator extends RunLocationCreator {
    protected static String PROPERTY_CHROME = "webdriver.chrome.driver";
    protected static String PATH_TO_CHROME_DRIVER = "C:\\data\\tools\\chromedriver.exe";

    protected WebDriver getWebDriver() {
        System.setProperty(PROPERTY_CHROME, PATH_TO_CHROME_DRIVER);
        driver = new ChromeDriver();
        return driver;
    }

}
