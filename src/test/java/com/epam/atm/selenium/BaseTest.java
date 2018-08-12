package com.epam.atm.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected WebDriver driver;
    protected String LOGIN = "yauhen_valodzin@epam.com.qa";
    protected String PASSWORD = "Ceakt_1234";

    protected abstract void getWebDriver();

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
