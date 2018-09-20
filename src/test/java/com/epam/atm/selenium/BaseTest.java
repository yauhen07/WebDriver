package com.epam.atm.selenium;

import core.LocalCreator;
import core.RunLocationCreator;
import core.WebDriverSingleton;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import util.ScreenshotsListener;

@Listeners(value = ScreenshotsListener.class)
public abstract class BaseTest {
    private RunLocationCreator runLocationCreator;

    @BeforeClass(description = "Start browser")
    public void startBrowser() {
        runLocationCreator = new LocalCreator();
        WebDriverSingleton.selectDriverType(runLocationCreator);
    }

    @AfterClass(description = "Close browser")
    public void closeBrowser() {
        WebDriverSingleton.kill();
    }
}
