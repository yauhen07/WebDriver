package com.epam.atm.selenium.pageobject;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
    protected WebDriver driver;
    private static final int WAIT_FOR_ELEMENTS_SECONDS = 10;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }
}
