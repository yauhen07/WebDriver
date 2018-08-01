package com.epam.atm.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseActionTest {
    protected WebDriver driver;
    protected String LOGIN = "yauhen_valodzin@epam.com.qa";
    protected String PASSWORD = "Ceakt_1234";

    @BeforeClass(description = "Start browser")
    public void startBrowser() {
        //System.setProperty("webdriver.chrome.driver", "C:\\data\\tools\\chromedriver.exe");
        try {
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.chrome());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().window().maximize();
        System.out.println("Maximize window");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Add Implicit wait");
    }

    @AfterClass(description = "Close browser")
    public void closeBrowser() {
        //driver.quit();
        System.out.println("Browser was closed");
    }
}
