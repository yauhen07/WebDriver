package com.epam.atm.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected ChromeDriver driver;
    protected String LOGIN = "yauhen_valodzin@epam.com.qa";
    protected String PASSWORD = "Ceakt_1234";

    @BeforeClass(description = "Start browser")
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\data\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
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
