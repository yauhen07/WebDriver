package com.epam.atm.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLocalTest extends BaseTest {

    protected void getWebDriver() {
        setWebDriverSystemProperty();
        driver = new ChromeDriver();
    }
}
