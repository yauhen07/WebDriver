package com.epam.atm.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLocalTest extends BaseTest {

    protected void getWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\data\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
    }
}
