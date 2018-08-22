package com.epam.atm.selenium;

import core.WebDriverSingleton;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {


//    public void setWebDriverSystemProperty() {
//        System.setProperty(PROPERTY_CHROME, PATH_TO_CHROME_DRIVER);
//    }

    @BeforeClass(description = "Start browser")
    public void startBrowser() {
        WebDriverSingleton.getWebDriverInstance();

    }

    @AfterClass(description = "Close browser")
    public void closeBrowser() {
        WebDriverSingleton.kill();
        System.out.println("Browser was closed");
    }


}
