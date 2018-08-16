package com.epam.atm.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected WebDriver driver;
    protected String PROPERTY_CHROME = "webdriver.chrome.driver";
    protected String PATH_TO_CHROME_DRIVER = "C:\\data\\tools\\chromedriver.exe";

    protected abstract void getWebDriver();

    public void setWebDriverSystemProperty() {
        System.setProperty(PROPERTY_CHROME, PATH_TO_CHROME_DRIVER);
    }

    @BeforeClass(description = "Start browser")
    public void startBrowser() {
        getWebDriver();
        driver.manage().window().maximize();
        System.out.println("Maximize window");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Add Implicit wait");
    }

    @AfterClass(description = "Close browser")
    public void closeBrowser() {
        driver.quit();
        System.out.println("Browser was closed");
    }


}
